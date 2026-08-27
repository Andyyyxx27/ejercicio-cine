# Análisis Caso 7 Cine Campus

Variables: formato(1-3), edad(0-120), cantidad, dia(1-7), esEstudiante

Reglas R1-R8:
R1: Si formato <1 o >3 => Error detener
R2: Si edad <0 o >120 => Error detener
R3: Si edad >=65 => 30% descuento
R4: Si edad <=11 => 20% descuento
R5: Si esEst=S y dia 1-5 => 15% descuento
R6: Si dia==3 => 10% descuento
R7: Si formato==3 y dia 6-7 => 10% recargo sobre (base-descuento)
R8: Si cantidad>=4 y (esEst=S o edad<=11) => Combo cortesía

Prioridad descuentos: R3 > R4 > R5 > R6
