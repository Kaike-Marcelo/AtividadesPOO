public class Programa {

    public static void main(String[] args){

        Professor p1 = new Professor("Alberto", "9876543211", "91827364513", "18-03-1979",
                                    "20-06-2019", 2500.00, "Doutorado");

        p1.setDisciplina(new String[]{"Gestão de Projetos", "Analista de Sistemas"});
        //p1.imprimeDados();
        p1.setCargo("Professor Assistente");
        p1.imprimeDados();
        p1.endereco = "Rua Monteiro Lombart, 129, Eunápolis-BA";
        p1.imprimeDados();


        Professor p2 = new Professor("Carla Almeida Santos", "8236184621", "90182736419", "03-10-1987",
                "22-05-2017", 7500.00, "Graduação");
        p2.setDisciplina(new String[]{"História da Computação"});
        p2.setCargo("Professor");
        p2.endereco = "Rua Margalhães, 839, Eunápolis-BA";
        p2.imprimeDados();
    }

}
