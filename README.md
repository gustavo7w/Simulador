# Simulador

Simulador 4N

Usando os dados da coluna TEMPO_SERVIÇO - > Tabela "Tempo necessário para resolver"

Com os dados nessa tabela podemos ver que: (Assumindo que a tabela está em minutos)

//        1% dos atendimentos demoram entre 307 e 344 minutos 
//        3% dos atendimentos demoram mais que 345 minutos
//        5% dos atendimentos demoram entre 153 e 268
//        12% dos atendimentos demoram entre 76 e 153
//        17% dos atendimentos demoram entre 38 e 76
//        61% dos atendimentos demoram entre 0 e 38

Esses valores são usados para calcular a demora de cada atendimento na classe Util