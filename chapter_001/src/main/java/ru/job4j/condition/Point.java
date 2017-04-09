package ru.job4j.condition;

/** Point.
*
* @author Daniil Emelyanov.
* @version %Id%
* @since 0.1
*/

public class Point {
	/** класс.
	*/
	private int x;
	/** класс.
	*/
	private int y;
	/** Конструктор класса Point.
	* @param x первый аргумент
    * @param y второй аргумент
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	/** Возвращение значения координаты х.
	* @return значение
    */
	public int getX() {
		return this.x;
	}
	/** Возвращение значения координаты у.
	* @return значение
    */
	public int getY() {
		return this.y;
	}
	/** Метод определяющий находится ли точка на заданной функции.
	* функция y(x) = a*x+b;
	* @param a первый аргумент
	* @param b второй аргумент
	* @return булевый результат
	*/
	public boolean is(int a, int b) {
		return this.y == a * this.x + b;
	}
}