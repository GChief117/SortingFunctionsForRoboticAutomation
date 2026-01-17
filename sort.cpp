#include <string>
#include <algorithm>
#include <iostream>

std::string sort(double width, double height, double length, double mass) {
    double volume = width * height * length;
    bool is_bulky = volume >= 1000000 || std::max({width, height, length}) >= 150;
    bool is_heavy = mass >= 20;
    
    if (is_bulky && is_heavy) {
        return "REJECTED";
    } else if (is_bulky || is_heavy) {
        return "SPECIAL";
    } else {
        return "STANDARD";
    }
}

int main() {
    double width, height, length, mass;
    std::cout << "Width (cm): ";
    std::cin >> width;
    std::cout << "Height (cm): ";
    std::cin >> height;
    std::cout << "Length (cm): ";
    std::cin >> length;
    std::cout << "Mass (kg): ";
    std::cin >> mass;
    std::cout << sort(width, height, length, mass) << std::endl;
    return 0;
}
