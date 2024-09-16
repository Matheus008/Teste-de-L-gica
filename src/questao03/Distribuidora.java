package questao03;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;

public class Distribuidora {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		int contadorDeDias = 0;
		double valorTotalDoMes = 0;
		int quantidadeMaiorValorMensal = 0;
		double mediaMensal = 0;

		File arquivoXML = new File(
				"D:/Programação/Workspace/Workspace-Eclipse/Teste Prático/Questoes/src/questao03/FaturamentoMensal.xml/");

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.parse(arquivoXML);
		doc.getDocumentElement().normalize();

		NodeList listaDias = doc.getElementsByTagName("Dia");

		Double[] valoresMensal = new Double[listaDias.getLength()];

		for (int i = 0; i < listaDias.getLength(); i++) {
			Node node = listaDias.item(i);

			Element elementoDia = (Element) node;

			String faturamentoStr = elementoDia.getElementsByTagName("Faturamento").item(0).getTextContent();

			try {
				Double faturamento = null;
				if (faturamentoStr != null && !faturamentoStr.equals("null")) {
					faturamento = Double.parseDouble(faturamentoStr);					
					contadorDeDias++;
				}
				valoresMensal[i] = faturamento;
			} catch (NumberFormatException e) {
			}
			if (valoresMensal[i] != null)
				valorTotalDoMes += valoresMensal[i];

		}

		mediaMensal = valorTotalDoMes / contadorDeDias;

		double menorValorFaturamento = valoresMensal[0];
		double maiorValorFaturamento = valoresMensal[0];

		for (int i = 0; i < listaDias.getLength(); i++) {
			if (valoresMensal[i] != null) {
				if (menorValorFaturamento > valoresMensal[i])
					menorValorFaturamento = valoresMensal[i];

				if (maiorValorFaturamento < valoresMensal[i])
					maiorValorFaturamento = valoresMensal[i];

				if (valoresMensal[i] > mediaMensal)
					quantidadeMaiorValorMensal++;
			}else {
			}
		}
		
		System.out.println("O menor valor de faturamento ocorrido em um dia do mês: "+ menorValorFaturamento);
		System.out.println("O maior valor de faturamento ocorrido em um dia do mês: "+ maiorValorFaturamento);
		System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal: "+ quantidadeMaiorValorMensal);
		
	}

}
