/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.ejb.queries;

/**
 *
 * @author camilopc
 */
public class InformeStaticQuery {

    public static final String OBTENER_CLIENTES_CON_GASTO_MAYOR_A_CIEN_MIL
            = "SELECT cl.nombre, cl.apellido1, cl.apellido2, cl.documento, sum(df.importe) as importe\n"
            + "FROM restaurante.cliente cl \n"
            + "INNER JOIN restaurante.factura f ON f.id_cliente=cl.id_cliente\n"
            + "INNER JOIN restaurante.detalle_factura df ON df.id_factura=f.id_factura\n"
            + "GROUP BY cl.id_cliente\n"
            + "HAVING importe >100000\n"
            + ";";

    public static final String OBTENER_VENTAS_MESERO_POR_MES_ANO
            = "SELECT c.nombre, c.apellido1, c.apellido2, IFNULL(sum(df.importe),0) as importe\n"
            + ", MONTH(f.fecha_factura) as mes, YEAR(f.fecha_factura) AS ano\n"
            + "FROM restaurante.factura f \n"
            + "INNER JOIN restaurante.detalle_factura df ON df.id_factura=f.id_factura\n"
            + "LEFT JOIN restaurante.camarero c ON c.id_camarero = f.id_camarero\n"
            + "GROUP BY c.id_camarero, YEAR(f.fecha_factura), MONTH(f.fecha_factura)\n"
            + "order by ano, mes desc\n"
            + ";";

}
