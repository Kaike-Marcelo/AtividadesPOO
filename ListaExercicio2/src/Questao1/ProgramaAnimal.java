package Questao1;

public class ProgramaAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal("Leão", "09/12/2000", "Mufasa", 12345, "África");
        System.out.println("\nDados do Animal: ");
        animal.imprimirInformacoes();

        animal.alterar("Tigre", "09/12/1999", "Tigrão", 54321, "EUA");
        System.out.println("\nDados do Animal: ");
        animal.imprimirInformacoes();
    }

}
