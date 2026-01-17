# Package Sorting Function

Functions in Python, C++, Javascript, and Typescript for a morning challenge with an robotic automation factory which dispatches packages to the correct stack based on volume and mass.

## Rules

A package is **bulky** if:
- Volume (width x height x length) is greater than or equal to 1,000,000 cm³, OR
- Any single dimension is greater than or equal to 150 cm

A package is **heavy** if:
- Mass is greater than or equal to 20 kg

## Stack Assignment

| Condition | Stack |
|-----------|-------|
| Not bulky and not heavy | STANDARD |
| Bulky or heavy (but not both) | SPECIAL |
| Both bulky and heavy | REJECTED |

## Function Signature

```
sort(width, height, length, mass) -> string
```

- **width**: Package width in centimeters
- **height**: Package height in centimeters
- **length**: Package length in centimeters
- **mass**: Package mass in kilograms
- **returns**: "STANDARD", "SPECIAL", or "REJECTED"

## Usage

### Python
```bash
python sort.py
```

### JavaScript
```bash
node sort.js
```

### TypeScript
```bash
npx ts-node sort.ts
```

### C++
```bash
g++ -std=c++11 sort.cpp -o sort && ./sort
```

## Example Table

| Width | Height | Length | Mass | Volume | Bulky? | Heavy? | Result |
|-------|--------|--------|------|--------|--------|--------|--------|
| 10 | 10 | 10 | 5 | 1,000 | No | No | STANDARD |
| 100 | 100 | 100 | 10 | 1,000,000 | Yes | No | SPECIAL |
| 50 | 50 | 50 | 25 | 125,000 | No | Yes | SPECIAL |
| 150 | 10 | 10 | 5 | 15,000 | Yes | No | SPECIAL |
| 100 | 100 | 100 | 20 | 1,000,000 | Yes | Yes | REJECTED |
