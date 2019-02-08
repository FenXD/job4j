package ru.job4j.condition;


public class Triangle {
    private Point a;
    private Point b;
    private Point c;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Вычисление полупериметра
     * @param ab - первая сторона
     * @param ac - вторая сторона
     * @param bc - третья сторона
     * @return Полупериметр треугольника
     */
    public double period(double ab, double ac, double bc) {
        return (ac + ab + bc) / 2;
    }

    /**
     * Нахождение прощалди треугольника
     * @return площадь
     */
    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(b);
        double ac = this.a.distanceTo(c);
        double bc = this.b.distanceTo(c);
        double p = this.period(ab, ac, bc);
        if (this.exists(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Проверка существования треугольника с сзаданными сторонами
     * @param ab - 1я сторона
     * @param ac - 2я сторона
     * @param bc - 3я сторона
     * @return существаует/не существует
     */
    public boolean exists(double ab, double ac, double bc) {
        return ((ab + ac > bc) & (ab + bc > ac) & (ac + bc > ab));
    }
}
