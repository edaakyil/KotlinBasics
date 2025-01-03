package com.edaakyil.kotlin.app.demo.company.employee

class ProjectWorker(var extraFee: Double = 0.0) : Worker() {
    override fun calculateInsurancePayment() = super.calculateInsurancePayment() + extraFee * 1.5
}
