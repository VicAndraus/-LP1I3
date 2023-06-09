class TestaData {
	public static void main (String[] args) {
		ConsultaAgendada p1 = new ConsultaAgendada(22, 37, 00, 8, 6, 2023, "Victoria", "Marcella");

        System.out.println("----------------------------");
        System.out.println(p1.getData());
        System.out.println(p1.getHora());
        System.out.println(p1.getNomePaciente());
        System.out.println(p1.getNomeMedico());
        System.out.println("----------------------------");
        
        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println(p2.getData());
        System.out.println(p2.getHora());
        System.out.println(p2.getNomePaciente());
        System.out.println(p2.getNomeMedico());

        System.out.println("----------------------------");
        p1.setData();
        System.out.println("----------------------------");
        p1.setHora();
        System.out.println("----------------------------");
        p1.setNomeMedico();
        System.out.println("----------------------------");
        p1.setNomePaciente();
        System.out.println("----------------------------");

        System.out.println(p1.getData());
        System.out.println(p1.getHora());
        System.out.println(p1.getNomePaciente());
        System.out.println(p1.getNomeMedico());

        System.out.println("Houve " + ConsultaAgendada.getAmostra() + " consultas!");
	}
}