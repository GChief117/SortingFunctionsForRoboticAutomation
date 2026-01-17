def sort(width: float, height: float, length: float, mass: float) -> str:
    volume = width * height * length
    is_bulky = volume >= 1_000_000 or max(width, height, length) >= 150
    is_heavy = mass >= 20
    
    if is_bulky and is_heavy:
        return "REJECTED"
    elif is_bulky or is_heavy:
        return "SPECIAL"
    else:
        return "STANDARD"


if __name__ == "__main__":
    width = float(input("Width (cm): "))
    height = float(input("Height (cm): "))
    length = float(input("Length (cm): "))
    mass = float(input("Mass (kg): "))
    print(sort(width, height, length, mass))
