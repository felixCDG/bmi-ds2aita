package br.senai.sp.jandira.bmi.utils

import java.util.Locale

fun numberConvertToLocael(value: Double): String{
    return  String.format(Locale.getDefault(), format = "%.1f", value)
}