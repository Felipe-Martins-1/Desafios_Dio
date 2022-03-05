
/**
 *
 * @author Felipe
 */
public class Curso extends Conteudo {

    protected int cargaHoraria;

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "\n\nCurso"
                + "\nTítulo = " + super.getTitulo()
                + "\nDescrição = " + super.getDescricao()
                + "\nCarga horária = " + this.getCargaHoraria();
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * this.getCargaHoraria();
    }

}
