package pl.wpardel.Notes;

import org.springframework.stereotype.Service;

import com.ibm.watson.developer_cloud.language_translator.v2.LanguageTranslator;
import com.ibm.watson.developer_cloud.language_translator.v2.model.Language;
import com.ibm.watson.developer_cloud.language_translator.v2.model.TranslationResult;

@Service
public class TranslatorService
{
	LanguageTranslator langTranslator = new LanguageTranslator();
	
	public String translate(String input)
	{
		langTranslator.setUsernameAndPassword("9f66349c-f8b3-42f9-8541-8e0e94126fdc", "HPVvgDNT4Aad");
		TranslationResult TR =  langTranslator.translate(input, Language.ENGLISH,Language.POLISH).execute();
		return TR.getFirstTranslation();
	}

}
