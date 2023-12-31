package ua.ostr_1;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println();
		System.out.println("Введіть 1, щоб додати фракцію до Верховної Ради");
		System.out.println("Введіть 2, щоб видалити фракцію з Верховної Ради");
		System.out.println("Введіть 3, щоб вивести всі фракції у Верховній Раді");
		System.out.println("Введіть 4, щоб очистити введену фракцію");
		System.out.println("Введіть 5, щоб вивести введену фракцію");
		System.out.println("Введіть 6, щоб додати депутата до фракції");
		System.out.println("Введіть 7, щоб видалити депутата з фракції");
		System.out.println("Введіть 8, щоб вивести список хабарників");
		System.out.println("Введіть 9, щоб вивести найбільшого хабарника");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {
			menu();

			switch (scanner.nextInt()) {

			case 1: {
				SupremeCouncil.getInstance().addDeputyGroup();
				break;
			}

			case 2: {
				SupremeCouncil.getInstance().removeDeputyGroup();
				break;
			}

			case 3: {
				SupremeCouncil.getInstance().getAllDeputyGroups();
				break;
			}

			case 4: {
				SupremeCouncil.getInstance().clearDeputyGroup();
				break;
			}

			case 5: {
				SupremeCouncil.getInstance().getDeputyGroup();
				break;
			}

			case 6: {
				SupremeCouncil.getInstance().addDeputyToDeputyGroup();
				break;
			}

			case 7: {
				SupremeCouncil.getInstance().removeDeputyFromDeputyGroup();
				break;
			}

			case 8: {
				SupremeCouncil.getInstance().getBribeTakersFromDeputyGroup();
				break;
			}

			case 9: {
				SupremeCouncil.getInstance().getLargestBribeTakerFromDeputyGroup();
				break;
			}

			default: {
				System.out.println("Введіть число від 1 до 9!");
				break;
			}
			}
		}
	}
}
