
import java.time.LocalDate;

/**
 *
 * @author Felipe
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "\n\nMentoria"
                + "\nTítulo = " + super.getTitulo()
                + "\nDescrição = " + super.getDescricao()
                + "\nCarga horária = " + this.getData();
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 200;
    }

}
