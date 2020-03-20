# Motivação

A crescente necessidade por software, com maior qualidade em menos tempo de desenvolvimento, tem tornado a abordagem de Linha de Produto de Software (LPS) bastante promissora. O Modelo de Features tem sido muito utilizado para modelagem de LPS, porém, este modelo omite determinadas informações sobre requisitos do sistema. PL-AOVgraph é uma linguagem de modelagem de requisitos orientada a aspectos voltada para LPS, que permite expressar detalhes de requisitos e de variabilidade. Assim, o Modelo de Features e PL-AOVgraph são complementares. Com o objetivo de incluir PL-AOVgraph no processo de desenvolvimento de LPS, foi definido um mapeamento bidirecional entre Modelo de Features e PL-AOVgraph.

# ReqSysMDD

A ferramenta ReqSysMDD consiste em um plug-in para o ambiente Eclipse, implementado através da abordagem Model Driven Development (MDD), que permite a especificação de requisitos utilizando a linguagem PL-AOVgraph, a verificação sintática da especificação e automatiza o mapeamento bi-direcional entre especificações de requisitos descritas em PL-AOVgraph e Modelos de Features para LPS.

As regras de mapeamento foram definidas e implementadas na linguagem ATL (Atlas Transformation Language).
Para a implementação da ferramenta foram utilizadas as seguintes tecnologias:  Eclipse Modeling Framework, Plug-in Developer Environment, ATL Development Tool, XText, Acceleo e Java.
