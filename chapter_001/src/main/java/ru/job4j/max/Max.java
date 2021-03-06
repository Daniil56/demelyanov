package ru.job4j.max;
/**
 * Max.
 *
 * @author Daniil Emelyanov.
 * @version %Id%
 * @since 0.1
 */

public class Max {
	/**...
	* Max in two
	* @param first - first value
	* @param second - second value
	* @return max among
	*/
public int max(int first, int second) {
	return first > second ? first : second;
	 }
	 /**...
	* Max in three
	* @param first - first value
	* @param second - second value
	* @param third - third value
	* @return max in three arguments
	*/
public int max(int first, int second, int third) {
	return  max(max(first, second), third);
}
}