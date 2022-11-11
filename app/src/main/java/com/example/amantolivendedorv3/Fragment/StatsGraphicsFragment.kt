package com.example.amantolivendedorv3.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.ContactsContract.Data
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anychart.APIlib
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry
import com.anychart.charts.Cartesian
import com.anychart.charts.Pie
import com.anychart.core.cartesian.series.Bar
import com.anychart.core.cartesian.series.Column
import com.example.amantolivendedorv3.R

class StatsGraphicsFragment : Fragment() {

    private var chart: AnyChartView? = null
    private var chart2: AnyChartView? = null
    private var chart3: AnyChartView? = null

    private val salary = listOf(10900,11590,12400,16350)
    private val month = listOf("#103","#99","#97","#88")

    private val products = listOf("Las Tres Torrecitas", "Alebrije Shisho", "Alebrije Dragato", "Las Tres Torres", "Mini y Nos")
    private val quantity = listOf(19, 17, 15, 12, 11)

    private val category = listOf("Alfarería", "Esculturas", "Ropa", "Bolsas", "Joyería", "Juguetes", "Pinturas", "Varios")
    private val visits = listOf(167, 128, 112, 105, 94, 88, 71, 64)

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_stats_graphics, container, false)


        chart = view.findViewById(R.id.pieChart)
        chart2 = view.findViewById(R.id.barChart)
        chart3 = view.findViewById(R.id.columnChart)

        APIlib.getInstance().setActiveAnyChartView(chart);
        configPieTopSeller()
        APIlib.getInstance().setActiveAnyChartView(chart2);
        configTopSoldProducts()
        APIlib.getInstance().setActiveAnyChartView(chart3);
        configTopVisitedCategories()

        return view

    }//End View

    private fun configTopVisitedCategories() {
        val column : Cartesian? = AnyChart.column()

        val dataColumnChart: MutableList<DataEntry> = mutableListOf()

        for(index in visits.indices){
            dataColumnChart.add(ValueDataEntry(category.elementAt(index), visits.elementAt(index)))
        }//End for

        column!!.data(dataColumnChart)
        column.title("Categorías más visitadas")
        column.animation(true)
        chart3!!.setChart(column)

    }//End fun configTopVisitedCategories

    private fun configTopSoldProducts() {
        val bar : Cartesian? = AnyChart.bar()

        val dataBarChart: MutableList<DataEntry> = mutableListOf()

        for (index in quantity.indices){
            dataBarChart.add(ValueDataEntry(products.elementAt(index), quantity.elementAt(index)))
        }//End for

        bar!!.data(dataBarChart)
        bar.title("Productos más vendidos")
        bar.barGroupsPadding(0.1)
        bar.animation(true)
        chart2!!.setChart(bar)

    }//End fun configTopSoldProducts

    private fun configPieTopSeller() {
        val pie : Pie = AnyChart.pie()

        val dataPieChart: MutableList<DataEntry> = mutableListOf()

        for (index in salary.indices){
            dataPieChart.add(ValueDataEntry(month.elementAt(index),salary.elementAt(index)))
        }//End for

        pie.data(dataPieChart)
        pie.title("Top vendedores del mes")
        pie.animation("")
        pie.startAngle(45)
        pie.sort("asc")
        pie.background("#F9F9F9")
        chart!!.setChart(pie)

    }//End function configPieTopSeller

}//End class StatsGraphicsFragment
