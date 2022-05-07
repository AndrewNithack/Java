public class Mensagem {

  public static void obterMenssagem(int hora) {
    switch (hora) {
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
        menssagemBomDia(hora);
        break;
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
        menssagemBoaTarde(hora);
        break;
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 00:
      case 1:
      case 2:
      case 3:
      case 4:
        menssagemBoaNoite(hora);
        break;

      default:
        menssagemHoraIncorreta();
        break;
    }
  }

  private static void menssagemBomDia(int hora) {
    System.out.println("Bom Dia, agora são " + hora + " hora");
  }

  private static void menssagemBoaTarde(int hora) {
    System.out.println("Boa Tarde, agora são " + hora + " hora");
  }

  private static void menssagemBoaNoite(int hora) {
    System.out.println("Boa Noite,agora são " + hora + " hora");
  }

  private static void menssagemHoraIncorreta() {
    System.out.println("Hora incorreta");
  }

}
