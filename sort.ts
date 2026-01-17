import * as readline from "readline";

function sort(width: number, height: number, length: number, mass: number): string {
    const volume = width * height * length;
    const isBulky = volume >= 1000000 || Math.max(width, height, length) >= 150;
    const isHeavy = mass >= 20;
    
    if (isBulky && isHeavy) {
        return "REJECTED";
    } else if (isBulky || isHeavy) {
        return "SPECIAL";
    } else {
        return "STANDARD";
    }
}

const rl = readline.createInterface({ input: process.stdin, output: process.stdout });

rl.question("Width (cm): ", (w) => {
    rl.question("Height (cm): ", (h) => {
        rl.question("Length (cm): ", (l) => {
            rl.question("Mass (kg): ", (m) => {
                console.log(sort(parseFloat(w), parseFloat(h), parseFloat(l), parseFloat(m)));
                rl.close();
            });
        });
    });
});
