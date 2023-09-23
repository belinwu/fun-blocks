package me.lincolnstuart.funblocks.playground.screens.components.chart

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import kotlinx.datetime.LocalDate
import me.lincolnstuart.funblocks.essentials.chart.bar.BarChart
import me.lincolnstuart.funblocks.essentials.chart.bar.utils.BarChartOptions
import me.lincolnstuart.funblocks.essentials.chart.bar.utils.BarChartValue
import me.lincolnstuart.funblocks.foundation.ui.token.content.size.FunBlocksContentSize
import me.lincolnstuart.funblocks.playground.components.Sample

class BarChartScreen : Screen {

    @Composable
    override fun Content() {
        Sample(
            component = {
                BarChart(
                    values =
                    listOf(
                        BarChartValue(
                            value = 300.0,
                            date = LocalDate(year = 1990, monthNumber = 10, dayOfMonth = 12)
                        ),
                        BarChartValue(
                            value = 500.0,
                            date = LocalDate(year = 2020, monthNumber = 12, dayOfMonth = 5)

                        ),
                        BarChartValue(
                            value = 400.0,
                            date = LocalDate(year = 2023, monthNumber = 5, dayOfMonth = 15)
                        )
                    ),
                    options = BarChartOptions(
                        title = "Bar Chart",
                        description = "Description",
                        height = FunBlocksContentSize.xxxHuge,
                        isAnimated = true
                    )
                )
            }
        ) {}
    }
}