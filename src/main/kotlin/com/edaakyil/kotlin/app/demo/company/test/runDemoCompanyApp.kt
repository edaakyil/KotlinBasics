package com.edaakyil.kotlin.app.demo.company.test

import com.edaakyil.kotlin.app.demo.company.employee.*
import com.edaakyil.kotlin.app.demo.company.hr.HumanResources
import kotlin.random.Random

fun main() = runDemoCompanyApp()

private fun runDemoCompanyApp() {
    val hr = HumanResources()

    while (true) {
        println("----------------------------")
        val employee = getEmployee()
        println("Dynamic type: ${employee.javaClass.name}")
        hr.payInsurance(employee)
        Thread.sleep(1000)
    }
}

private fun getEmployee(): Employee {
    return when (Random.nextInt(3))  {
        0 -> getManager()
        1 -> getSalesManager()
        2 -> getWorker()
        else -> getProjectWorker()
    }
}

private fun getManager() : Manager {
    val manager = Manager(300000.0, "Yazılım")

    manager.citizenId = "12345678"
    manager.name = "Ali Veli"
    manager.address = "Mecidiyeköy"

    return manager
}

private fun getWorker() : Worker {
    val worker = Worker(1000.0, 8)

    worker.citizenId = "12345679"
    worker.name = "Selami Secati"
    worker.address = "Fatih"

    return worker
}

private fun getSalesManager() : SalesManager {
    val salesManager = SalesManager(40000.0)

    salesManager.citizenId = "12345677"
    salesManager.name = "Mustafa Mehmet"
    salesManager.address = "Beykoz"
    salesManager.salary = 300000.0
    salesManager.department = "Pazarlama"

    return salesManager
}

private fun getProjectWorker() : ProjectWorker {
    val projectWorker = ProjectWorker(30000.0)

    projectWorker.citizenId = "12345675"
    projectWorker.name = "Ayşe Fatma"
    projectWorker.address = "Kadıköy"
    projectWorker.feePerHour = 2000.0
    projectWorker.hourPerDay = 6

    return projectWorker
}