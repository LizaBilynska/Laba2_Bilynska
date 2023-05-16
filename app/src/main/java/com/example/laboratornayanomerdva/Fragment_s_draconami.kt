package com.example.laboratornayanomerdva

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.laboratornayanomerdva.databinding.FragmentBlankSDraconamiBinding

class Fragment_s_draconami : Fragment() {
    lateinit var binding: FragmentBlankSDraconamiBinding
    private val adapter = Adapter_s_draconami{
        showMore(it)
    }
    private val DraconList = listOf(
        Dracony("Королева Огнієдів", R.drawable.firewormqueen, "Це підвид Огнєєдов, досить великий дракон," +
                "що світиться і досить небезпечний, який належить класу: «Кочегари»." +
                "Вона набагато більша, ніж її подані — звичайні Огнеєди."),

        Dracony("Днівна Фурія", R.drawable.lightfury, "Це маловідомий вид драконів, що є близькоспорідненим видом Нічних Фурій." +
                " уже сильний і красивий дракон," +
                " який відноситься до роду Фурій, і належить класу Разящі."),

        Dracony("Нічна Фурія", R.drawable.nightfury, "Майже повністю вимерлий вид драконів, що належить класу Разящі." +
                " Цей дракон один з найнебезпечніших і найунікальніших з усіх відомих видів."),

        Dracony("Нічне Сяйво", R.drawable.nightsiyanie, "Новий вид драконів, який є гібридом Нічної Фурії та Денної Фурії." +
                "Вперше з'явився наприкінці третьої частини мультфільму." +
                " Належить до сімейства Фурій, належить класу «Разящі»."),

        Dracony("Морський Шокер", R.drawable.seashockerwhite, "Це двоголовий, спритний і зграйний дракон, що належить класу: «Водні»." +
                " Морський Шокер – великий дракон, повністю пристосований до водного середовища. Він має гладке і обтічне тіло."),

        Dracony("Слизькоспів", R.drawable.slithersong, "Це рідкісний дракон, який належить класу «Загадкові»." +
                "Вперше цей дракон з'явився у грі Dragons: Rise of Berk," +
                "потім у грі School of Dragons. "+
                " Цей вид драконів є близьким родичем Пісні Смерті."),

        Dracony("Маленький дракон", R.drawable.melkiy, "Я загубила його опис, саме тому опишу його вручну." +
                " Це маленький і прикольний дракон, який дуже ніжний, але іноді противний і кусючий. Вони за розміром схожі" +
                " на кішку, тому їх в теорії можно заводити як домашніх улюбленців"),

        Dracony("Великий Смутьян", R.drawable.smutyan,
                "це гігантський дракон, який належить класу Водні." +
                " Вперше цей дракон з'являється в останній серії серіалу Дракони: Гонки по краю." +
                " Великий Смутьян — величезний дракон шипастий з двома довгими бивнями, " +
                " що ростуть з обох боків голови."),
        Dracony("Шепіт Смерті", R.drawable.whisper, "Це один із найжахливіших, найнебезпечніших драконів," +
                "  який належить класу: «Камнеїди». Один із таких драконів був приручений Елвіном Вероломним." +
                " Якщо ви побачите наживо Шепіт Смерті, то знайте, якщо він вас не вб'є, то все життя вт будете заїкатися."),
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter.addDracon(DraconList)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankSDraconamiBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply{
            rvDracony.adapter=adapter

        }
    }

    private fun showMore(Dracon: Dracony)
    {
        findNavController().navigate(Fragment_s_draconamiDirections.actionFragmentSDraconamiToFragmentOpisanie(Dracon))
    }
}