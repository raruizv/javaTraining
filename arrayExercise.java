// Guia UDistrial, programación básica (Capitulo Arreglos)

import java.util.ArrayList;
import java.lang.Math;
import java.lang.System;
import java.util.Arrays;
import java.util.Scanner;

public class arrayExercise {
    /*
	Ejercicio 53
	Escribir un programa que llene un arreglo con los numeros comprendidos
    entre 4 y 14

    public static void main(String[] args){
        int[] arraySimple = new int[11];

        for (int idx = 0; idx < arraySimple.length; idx++) {
                arraySimple [idx] = 4+idx;
        }
        System.out.println(Arrays.toString(arraySimple));
    }
	*/

    /* 54
    Escribir un programa que llene un arreglo con los numeros pares
    comprendidos entre 1 y 100

    public static int[] array_54 = new int[50];

    public static void main(String[] args) {
        System.out.println("Numeros pares hasta 100:");
        for(int idx = 0;idx < array_54.length; idx++) {
			array_54[idx] = 2+2*idx;
        }
		System.out.println(Arrays.toString(array_54));
    }
    */

    /*
	Ejercicio 55
	Escribir un programa que llene un arreglo con los numeros comprendidos
	entre 0 y 100 divisibles por 3


	public static void main(String[] args) {
		ArrayList<Integer> arreglo_55 = new ArrayList<Integer>();
		System.out.println("Numeros divisibles por 3:");
		for (int indice = 0; indice < 101; indice++){
			if(indice % 3 == 0 ){
				arreglo_55.add(indice);
			}
		}
		for (int indice = 0; indice < arreglo_55.size(); indice++)
			System.out.println(arreglo_55.get(indice));
	}
	*/

	/*
	Ejercicio 56
	Escribir un programa que llene un arreglo con cinco numeros consecutivos
	y haga una copia de este arreglo en otro


    public static void main(String[] args) {
        ArrayList<Integer> masterArry = new ArrayList<>();
		ArrayList<Integer> copyArry = new ArrayList<>();
        Scanner wrtConsole = new Scanner(System.in);
        System.out.println("Favor ingrese un item inicial: ");
        int item = wrtConsole.nextInt();
        masterArry.add(item);
		for(int idx = 1; idx < 5; idx++)
			masterArry.add(item+idx);
		copyArry = masterArry;
		System.out.println("Cinco consecutivos: ");
		for(int idx = 0; idx < copyArry.size(); idx++)
			System.out.println(copyArry.get(idx));

    }
	*/

	/*
	Ejercicio 57
	Escribir un programa que llene un arreglo de 10 numeros enteros
	aleatorios comprendidos entre 50 y 100 y copie en otro arreglo esos
	numeros multiplicados por 0.5


	public static int fijarRango(int min, int max){
		int rango = (max - min) + 1;
		return (int)(Math.random() * rango) + min;
	}

	public static void main(String[] args) {
		int[] array_57 = new int[10];
		int[] arryCpy = new int[10];

		for(int idx = 0; idx < 10; idx++){
			array_57[idx] = fijarRango(50, 100);
		}

		System.arraycopy(array_57, 0, arryCpy, 0, 10);

		for (int idx = 0; idx < 10; idx++) {
			arryCpy[idx] *= 2;
		}

		System.out.println(Arrays.toString(array_57));
		System.out.println(Arrays.toString(arryCpy));

	}
	*/

	/*
	Ejercicio 58
	Escribir un programa que llene un arreglo con los veinte primeros
	numeros pares y calcule su suma

	public static void main(String[] args){

		int[] array_58;
		array_58 = new int[20];

		int sumItem;
		sumItem = 0;

		for (int idx = 0; idx < array_58.length; idx++) {
			array_58[idx] = 2+2*idx;
		}

		for (int idx = 0; idx < array_58.length; idx++) {
			sumItem += array_58[idx];
		}

		System.out.println(Arrays.toString(array_58));

		System.out.print("La suma de los veinte primeros numeros pares es:\n");
		System.out.println(sumItem);
	}
	*/

	/*
	Ejercicio 59
	Escribir un programa que solicite cinco numeros, los almacene en un arreglo,
	y calcule la media aritmetica de esos numeros

	public static void main(String[] args){
		int[] array_59;
		int num_1, num_2, num_3, num_4, num_5;
		float sumItemArray, mediaArry;
		Scanner writeCnsl;

		array_59 = new int[5];
		sumItemArray = 0;
		writeCnsl = new Scanner(System.in);

		System.out.print("Ingrese entero positivo: ");
		num_1 = writeCnsl.nextInt();
		System.out.print("Ingrese entero positivo: ");
		num_2 = writeCnsl.nextInt();
		System.out.print("Ingrese entero positivo: ");
		num_3 = writeCnsl.nextInt();
		System.out.print("Ingrese entero positivo: ");
		num_4 = writeCnsl.nextInt();
		System.out.print("Ingrese entero positivo: ");
		num_5 = writeCnsl.nextInt();

		array_59[0] = num_1;
		array_59[1] = num_2;
		array_59[2] = num_3;
		array_59[3] = num_4;
		array_59[4] = num_5;

		for (int idx = 0; idx < array_59.length; idx++) {
			sumItemArray += array_59[idx];
		}

		mediaArry = sumItemArray / array_59.length;

		System.out.println(Arrays.toString(array_59));
		System.out.print("La media aritmetica del arreglo es: ");
		System.out.println(mediaArry);

	}
	*/
	/*
	Ejercicio 60
	Escriba un programa que tras asignar los numeros 23, 45, 68, 99, 10,
	15, y 4 en un arreglo, determine la posición del arreglo en la que
	encuentra el maximo valor

	public static void main(String[] args){
		int[] array_60;
		int maxValue, maxPosition;
		Scanner writeCnsl;

		array_60 = new int[7];
		writeCnsl = new Scanner(System.in);

		for (int idx = 0; idx < array_60.length; idx++) {
			System.out.print("Ingrese el entero positivo indicado: ");
			array_60[idx] = writeCnsl.nextInt();
		}

		maxValue = array_60[0];
		maxPosition = 0;

		for (int idx = 1; idx < array_60.length; idx++) {
			if (maxValue < array_60[idx]) {
				maxValue = array_60[idx];
				maxPosition = idx;
			}
		}

		System.out.println(Arrays.toString(array_60));
		System.out.print("La posicion del valor mayor dentro del arreglo es: ");
		System.out.println(maxPosition);

	}
	*/

	/*
	Ejercicio 61
	Escribir un programa que tras asignar los numeros -2, 5, 8, -9, 10,
	15 y -4 a  un arreglo, calcule en independencia, la suma de los
	elementos positivos y negativos

	public static void main(String[] args){

		int[] array_61;
		int negtvSuma, postvSuma;
		Scanner writeCnsl;

		array_61 = new int[7];
		negtvSuma = 0;
		postvSuma = 0;
		writeCnsl = new Scanner(System.in);

		for (int idx = 0; idx < array_61.length; idx++) {
			System.out.print("Ingrese entero indicado: ");
			array_61[idx] = writeCnsl.nextInt();
			if (array_61[idx] < 0){
				negtvSuma += array_61[idx];
			} else {
				postvSuma += array_61[idx];
			}
		}

		System.out.println(Arrays.toString(array_61));
		System.out.print("La suma de los enteros negativos es ");
		System.out.println(negtvSuma);
		System.out.print("La suma de los enteros positivos es ");
		System.out.println(postvSuma);
	}
	*/

	/*
	Ejercicio 62
	Escribir un programa que tras asignar 10 numeros leidos desde teclado
	a un arreglo, determine las posiciones del arreglo en que se encuentran
	el maximo y el minimo valor

	public static void main(String[] args) {
		int[] array_62;
		int minPosition, maxPosition, minValue, maxValue;
		Scanner writeCnsl;

		array_62 = new int[10];
		writeCnsl = new Scanner(System.in);

		for (int idx = 0; idx < array_62.length; idx++) {
			System.out.print("Ingrese valor entero: ");
			array_62[idx] = writeCnsl.nextInt();
		}

		minPosition = 0;
		maxPosition = 0;
		minValue = array_62[0];
		maxValue = array_62[0];

		for (int idx = 1; idx < array_62.length; idx++) {
			if (array_62[idx] < minValue) {
				minValue = array_62[idx];
				minPosition = idx;
			} else if (array_62[idx] > maxValue) {
				maxValue = array_62[idx];
				maxPosition = idx;
			}
		}

		System.out.println(Arrays.toString(array_62));
		System.out.print("La posicion del valor minimo en el arreglo es: ");
		System.out.print(minPosition + "\n");
		System.out.print("La posicion del valor maximo en el arreglo es: ");
		System.out.print(maxPosition);
	}
	*/

	/*
	Ejercicio 63
	Escribir un programa que imprima la media de elementos que se encuentran en
	las posiciones pares y la media de los elementos que se encuentran en las
	posiciones impares de un arreglo de 20 posiciones

	public static int fijarRango(int min, int max){
		int rango = (max - min) + 1;
		return (int)(Math.random() * rango) + min;
	}

	public static void main (String[] args) {

		final int termNum;
		int[] array_63;
		int sumPar_pos, sumIpr_pos;
		float mediaPar_pos, mediaImpr_pos;

		array_63 = new int[20];
		termNum = 10;
		sumIpr_pos = 0;
		sumPar_pos = 0;

		for (int idx = 0; idx < array_63.length; idx++) {
			array_63[idx] = fijarRango(10, 100);
			if (idx % 2 != 0) {
				sumIpr_pos += array_63[idx];
			} else if (idx % 2 == 0) {
				sumPar_pos += array_63[idx];
			}
		}

		mediaImpr_pos = (float) sumIpr_pos / termNum;
		mediaPar_pos = (float) sumPar_pos / termNum;

		System.out.println(Arrays.toString(array_63));
		System.out.print("La media de los valores en las posiciones impares es: ");
		System.out.println(mediaImpr_pos);
		System.out.print("La media de los valores en las posiciones pares es: ");
		System.out.println(mediaPar_pos);

	}
	*/

	/*
	Ejercicio 64
	Solucion que determine la posicion de la siguiente matriz  en la que se
	encuentra el valor máximo
						|32	|56	|50	|
						|49	|99	|12	|
						|78	|57	|89	|

	public static void main(String[] args) {

		int[][] matriz_64;
		int[] posMaxim;
		int maxValue;
		Scanner writeCnsl;

		matriz_64 = new int[3][3];
		posMaxim = new int[2];
		maxValue = matriz_64[0][0];
		writeCnsl = new Scanner(System.in);

		for (int iRow = 0; iRow < matriz_64.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_64[iRow].length; jColmn++) {
				System.out.print("Ingrese entero positivo, segun enunciado: ");
				matriz_64[iRow][jColmn] = writeCnsl.nextInt();
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < matriz_64.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_64[iRow].length; jColmn++) {
				if (matriz_64[iRow][jColmn] > maxValue) {
					maxValue = matriz_64[iRow][jColmn];
					posMaxim[0] = iRow;
					posMaxim[1] = jColmn;
				}
			}
		}

		for (int iRow = 0; iRow < matriz_64.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_64[iRow].length; jColmn++) {
				System.out.print(matriz_64[iRow][jColmn] + "\t");
			}
			System.out.println();
		}

		System.out.print("La ubicacion del valor maximo en la matriz es: ");
		System.out.println(Arrays.toString(posMaxim));
	}
	*/

	/*
	Ejercicio 65
	Una solución que sume, independiente, los elementos positivos y negativos
	de la siguiente matriz:
					|-2	|56	|50	|
					|44	|-12|-42|
					|70	|57	|-86|

	public static void main(String[] args) {

		int[][] matriz_65;
		int negtvSuma, postvSuma;
		Scanner writeCnsl;

		matriz_65 = new int[3][3];
		negtvSuma = 0;
		postvSuma = 0;
		writeCnsl = new Scanner(System.in);

		for (int iRow = 0; iRow < matriz_65.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_65[iRow].length; jColmn++) {
				System.out.print("Ingrese valor entero, segun enunciado: ");
				matriz_65[iRow][jColmn] = writeCnsl.nextInt();
				if (matriz_65[iRow][jColmn] < 0) {
					negtvSuma += matriz_65[iRow][jColmn];
				} else if (matriz_65[iRow][jColmn] > 0) {
					postvSuma += matriz_65[iRow][jColmn];
				}
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < matriz_65.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_65[iRow].length; jColmn++) {
				System.out.print(matriz_65[iRow][jColmn]+"\t");
			}
			System.out.println();
		}

		System.out.print("La suma de los enteros negativos es: ");
		System.out.println(negtvSuma);
		System.out.print("La suma de los enteros positivos es: ");
		System.out.println(postvSuma);
	}
	/*

	/*
	Ejercicio 66
	Una solucion que multiplique por dos (2) los elementos de la siguiente matriz:
							| 5 | 6 |13 |
							|14 | 2 | 4 |
							|21 | 7 | 6 |

	public static void main(String[] args) {

		int[][] matriz_66;
		Scanner writeCnsl;

		matriz_66 = new int[3][3];
		writeCnsl = new Scanner(System.in);

		for (int iRow = 0; iRow < matriz_66.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_66[iRow].length; jColmn++) {
				System.out.print("Ingrese valor entero, segun enunciado: ");
				matriz_66[iRow][jColmn] = writeCnsl.nextInt();
				matriz_66[iRow][jColmn] *= 2;
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < matriz_66.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_66[iRow].length; jColmn++) {
				System.out.print(matriz_66[iRow][jColmn]+"\t");
			}
			System.out.println();
		}
	}
	*/

	/*
	Ejercicio 67
    Escribir un programa que llene la primera columna de una matriz
	de 3 filas por 10 columnas con numeros aleatorios entre 1 y 20,
	la segunda fila con los cuadrados de los datos de la primera
	fila; y la tercera fila con la suma de la primera y la segunda

	public static int fijarRango(int min, int max){
		int rango = (max - min) + 1;
		return (int)(Math.random() * rango) + min;
	}

	public static void main(String[] args) {

		int[][] matriz_67;
		matriz_67 = new int[3][10];

		for (int iRow = 0; iRow < matriz_67.length - 2; iRow++) {
			for (int jColmn = 0; jColmn < matriz_67[iRow].length; jColmn++) {
				matriz_67[iRow][jColmn] = fijarRango(1, 20);
			}
		}

		for (int iRow = 1; iRow < matriz_67.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_67[iRow].length; jColmn++) {
				if (iRow == 1) {
					matriz_67[iRow][jColmn] = matriz_67[0][jColmn];
					matriz_67[iRow][jColmn]	*= matriz_67[iRow][jColmn];
				} else if (iRow == 2) {
					matriz_67[iRow][jColmn] = matriz_67[0][jColmn] + matriz_67[1][jColmn];
				}
			}
		}

		for (int iRow = 0; iRow < matriz_67.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_67[iRow].length; jColmn++) {
				System.out.print(matriz_67[iRow][jColmn]+"\t");
			}
			System.out.println();
		}
	}
	*/

	/*
	Ejercicio 68
	Solución que sume los datos de cada una de la filas de la siguiente matriz;
	el resultado se almacenara en la ultima posicion de cada fila
							| 5 | 6	| 7 | 9 |	|
							|11 | 8	| 2 |	|	|

	public static void main (String[] args) {

		int[][] matriz_68;
		int acumSuma;
		Scanner writeCnsl;

		matriz_68 = new int[2][5];
		acumSuma = 0;
		writeCnsl = new Scanner(System.in);

		for (int iRow = 0; iRow < matriz_68.length; iRow++) {
			if (iRow == 0) {
				for (int jColmn = 0; jColmn < matriz_68[iRow].length - 1; jColmn++) {
					System.out.print("Ingrese entero positivo, segun enunciado: ");
					matriz_68[iRow][jColmn] = writeCnsl.nextInt();
				}
			} else if (iRow == 1) {
				for (int jColmn = 0; jColmn < matriz_68[iRow].length - 2; jColmn++) {
					System.out.print("Ingrese entero positivo, segun enunciado: ");
					matriz_68[iRow][jColmn] = writeCnsl.nextInt();
				}
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < matriz_68.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_68[iRow].length; jColmn++) {
				System.out.print(matriz_68[iRow][jColmn]+"\t");
			}
			System.out.println();
		}

		System.out.print("\n");

		for (int iRow = 0; iRow < matriz_68.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_68[iRow].length; jColmn++) {
				if (matriz_68[iRow][jColmn] > 0){
					acumSuma += matriz_68[iRow][jColmn];
				} else if (matriz_68[iRow][jColmn] == 0) {
					matriz_68[iRow][jColmn] = acumSuma;
					acumSuma += matriz_68[iRow][jColmn];
				}
			}
			acumSuma = 0;
		}

		for (int iRow = 0; iRow < matriz_68.length; iRow++) {
			for (int jColmn = 0; jColmn < matriz_68[iRow].length; jColmn++) {
				System.out.print(matriz_68[iRow][jColmn]+"\t");
			}
			System.out.println();
		}
	}
	*/

	/*
	Ejercicio 69
	Escribir un programa que sume los datos de cada una de las columnas de
	la siguiente matriz; el resultado se almacenará en la última posición de
	cada columna
						______________
						| 5 | 6 | 13 |
						| 14| 2 | 4  |
						| 21| 7 | 6  |
						| 12| 9 | 5  |
						|__ |__	|___ |

	public static void main(String[] args){
		int[][] array_69;
		int acumSuma;
		Scanner writeCnsl;

		array_69 = new int[5][3];
		acumSuma = 0;
		writeCnsl = new Scanner(System.in);

		for(int iRow = 0; iRow < array_69.length - 1; iRow++) {
			for (int jColumn = 0; jColumn < array_69[iRow].length; jColumn++) {
				System.out.print("Ingrese valor entero:\n");
				array_69[iRow][jColumn] = writeCnsl.nextInt();
			}
			System.out.println();
		}

		//Indices de terminación invertidos
		for (int iRow = 0; iRow < array_69[iRow].length; iRow++) {
			for (int jColumn = 0; jColumn < array_69.length; jColumn++) {
				//Procesamiento en sentido 'vertical'
				if (array_69[jColumn][iRow] > 0) {
					acumSuma += array_69[jColumn][iRow];
				} else if (array_69[jColumn][iRow] == 0) {
					array_69[jColumn][iRow] = acumSuma;
				}
			}
			acumSuma = 0;
		}

		for (int iRow = 0; iRow < array_69.length; iRow++) {
			for (int jColumn = 0; jColumn < array_69[iRow].length; jColumn++) {
				System.out.print(array_69[iRow][jColumn] + "\t");
			}
			System.out.println();
		}
	}
	*/

	/*
	Ejercicio 70
	Una solucion que sume los elementos de cada una de las filas y de las
	columnas de la siguiente matriz; el resultado de cada suma se almacenara
	en la ultima posición de la fila o columna correspondiente. Ademas la
	suma total de todos los elementos de la matriz se almacenará en el
	elemento de la esquina inferior derecha de la matriz.

							| 2 | 9 |11 |  |
							| 1 |12 | 4 |  |
							|21 |17 | 8 |  |
							| 2 |39 | 5 |  |
							|	|	|	|  |

	public static void main (String[] args) {

		int[][] matriz_70;
		int acumSuma, finalSum;
		Scanner writeCnsl;

		matriz_70 = new int[5][4];
		acumSuma = 0;
		finalSum = 0;
		writeCnsl = new Scanner(System.in);

		for (int iRow = 0; iRow < matriz_70.length - 1; iRow++) {
			for (int jColmn = 0; jColmn < matriz_70[iRow].length - 1; jColmn++) {
				System.out.print("Ingrese entero positivo, segun enunciado: ");
				matriz_70[iRow][jColmn] = writeCnsl.nextInt();
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < matriz_70.length - 1; iRow++) {
			for (int jColmn = 0; jColmn < matriz_70[iRow].length; jColmn++) {
				if (matriz_70[iRow][jColmn] > 0) {
					acumSuma += matriz_70[iRow][jColmn];
				} else if (matriz_70[iRow][jColmn] == 0) {
					matriz_70[iRow][jColmn] = acumSuma;
				}
			}
			acumSuma = 0;
		}


		for (int iRow = 0; iRow < matriz_70[iRow].length - 1; iRow++) {
			for (int jColmn = 0; jColmn < matriz_70.length; jColmn++) {
				if (matriz_70[jColmn][iRow] > 0) {
					acumSuma += matriz_70[jColmn][iRow];
				} else if (matriz_70[jColmn][iRow] == 0) {
					matriz_70[jColmn][iRow] = acumSuma;
				}
			}
			acumSuma = 0;
		}

		for (int iRow = 0; iRow < matriz_70.length - 1; iRow++) {
			for (int jColmn = 0; jColmn < matriz_70[iRow].length - 1; jColmn++) {
				acumSuma += matriz_70[iRow][jColmn];
			}
		}

		for (int iRow = matriz_70.length - 1; iRow > matriz_70.length - 2; iRow--) {
			for (int jColmn = matriz_70[iRow].length - 1; jColmn > matriz_70[iRow].length - 2; jColmn--) {
				matriz_70[iRow][jColmn] = acumSuma;
			}
		}

		for (int iRow = 0; iRow < matriz_70.length; iRow++) {
			for (int jColumn = 0; jColumn < matriz_70[iRow].length; jColumn++) {
				System.out.print(matriz_70[iRow][jColumn] + "\t");
			}
			System.out.println();
		}
	}
	*/

	/*
	Ejercicio 71
	Una solucion que divida todos los elementos de una matriz M(3, 4) por el
	elemento situado en la posicion 2,2
	*/

	/*
	Ejercicio 72
	Escribir un programa que almacene en un arreglo los numeros primos
	comprendidos entre 1 y 100

	public static void main(String[] args){
		int[][] mtx_enteros;
		int[] arrayPrimes;

		int item = 1;
		mtx_enteros = new int[5][5];
		arrayPrimes = new int[7];

		for (int iRow = 0; iRow < mtx_enteros.length; iRow++) {
			for (int jColmn = 0; jColmn < mtx_enteros[iRow].length; jColmn++){
				mtx_enteros[iRow][jColmn] = item++;
			}
		}

		for (int iRow = 0; iRow < mtx_enteros.length; iRow++) {
			for (int jColmn = 0; jColmn < mtx_enteros[iRow].length; jColmn++){
				System.out.print(mtx_enteros[iRow][jColmn]+"\t");
			}
			System.out.println();
		}

		for (int iRow = 0; iRow < mtx_enteros.length; iRow++) {
			for (int jColmn = 0; jColmn < mtx_enteros[iRow].length; jColmn++){
				if(mtx_enteros[iRow][jColmn] % 5 == 0){

				}
			}
		}
	}
	*/

	/*
	Ejercicio 73
	Solución que genera la matriz traspuesta de una matriz de 3 filas
	y 4 columnas. La matriz traspuesta de una matriz M(m,n) se obtiene
	intercambiando filas por columnas y vicerversa; el resultado se
	tiene que almacenar en una nueva matriz M_TRANS(n,m)
	*/

	/*
	Ejercicio 75
	Una solucion que sume dos matrices bidimensionales. Las matrices
	para que puedan sumarse deben tener las mismas dimensiones
	*/

	/*
	Ejercicio 85
	Una solucion que sume los valores que hay por encima de de la
	diagonal principal de una matriz de 4 por 4. Los valores se deben
	asignar	aleatoriamente
	*/
}
