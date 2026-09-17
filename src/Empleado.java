public class Empleado {

    private int codigo;

    public Empleado()
    {
        codigo = 0;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
    }

    public boolean codigoValido()
    {
        return codigo >= 100 && codigo <= 999;
    }

    public String obtenerCategoria()
    {
        boolean div2 = codigo % 2 == 0;
        boolean div3 = codigo % 3 == 0;
        boolean div5 = codigo % 5 == 0;
        String categoria;

        if (div2 && div3 && div5)
        {
            categoria = "Director General";
        }
        else if (!div2 && div3 && div5)
        {
            categoria = "Directivo";
        }
        else if (div2 && !div3 && !div5)
        {
            categoria = "Staff";
        }
        else if (!div2 && !div3 && !div5)
        {
            categoria = "Seguridad";
        }
        else
        {
            categoria = "Sin categoría asignada";
        }

        return categoria;
    }
}