package com.juicelabs.fhir.model

import java.io.File
import kotlin.test.assertTrue
import org.junit.jupiter.api.Test

class Bundle39DataTest : DataTests() {
    @Test
    fun `questionnaire-profile-example-ussg-fht 408 Test`() {
        val json = File("./src/test/resources/model/sample_data/questionnaire-profile-example-ussg-fht.json").readTextAndClose()
        val obj = mapper.fromJson(json, Bundle::class.java)
        assertTrue(stringMatch("LA10537-1", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[6].code))
        assertTrue(stringMatch("-- Colon Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[6].display))
        assertTrue(stringMatch("LA10548-8", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[7].code))
        assertTrue(stringMatch("-- Esophageal Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[7].display))
        assertTrue(stringMatch("LA10547-0", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[8].code))
        assertTrue(stringMatch("-- Gastric Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[8].display))
        assertTrue(stringMatch("LA10541-3", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[9].code))
        assertTrue(stringMatch("-- Kidney Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[9].display))
        assertTrue(stringMatch("LA10545-4", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[10].code))
        assertTrue(stringMatch("-- Leukemia", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[10].display))
        assertTrue(stringMatch("LA10542-1", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[11].code))
        assertTrue(stringMatch("-- Lung Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[11].display))
        assertTrue(stringMatch("LA10546-2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[12].code))
        assertTrue(stringMatch("-- Muscle Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[12].display))
        assertTrue(stringMatch("LA10539-7", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[13].code))
        assertTrue(stringMatch("-- Ovarian Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[13].display))
        assertTrue(stringMatch("LA10538-9", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[14].code))
        assertTrue(stringMatch("-- Prostate Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[14].display))
        assertTrue(stringMatch("LA10543-9", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[15].code))
        assertTrue(stringMatch("-- Skin Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[15].display))
        assertTrue(stringMatch("LA10540-5", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[16].code))
        assertTrue(stringMatch("-- Thyroid Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[16].display))
        assertTrue(stringMatch("LA10544-7", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[17].code))
        assertTrue(stringMatch("-- Uterine Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[17].display))
        assertTrue(stringMatch("LA10550-4", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[18].code))
        assertTrue(stringMatch("-- Other Cancer", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[18].display))
        assertTrue(stringMatch("LA10529-8", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[19].code))
        assertTrue(stringMatch("Diabetes", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[19].display))
        assertTrue(stringMatch("LA10551-2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[20].code))
        assertTrue(stringMatch("-- Diabetes Type 1", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[20].display))
        assertTrue(stringMatch("LA10552-0", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[21].code))
        assertTrue(stringMatch("-- Diabetes Type 2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[21].display))
        assertTrue(stringMatch("LA10553-8", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[22].code))
        assertTrue(stringMatch("-- Gestational Diabetes", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[22].display))
        assertTrue(stringMatch("LA10532-2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[23].code))
        assertTrue(stringMatch("Gastrointestinal Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[23].display))
        assertTrue(stringMatch("LA10554-6", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[24].code))
        assertTrue(stringMatch("-- Crohn's Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[24].display))
        assertTrue(stringMatch("LA10555-3", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[25].code))
        assertTrue(stringMatch("-- Irritable Bowel Syndrome", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[25].display))
        assertTrue(stringMatch("LA10556-1", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[26].code))
        assertTrue(stringMatch("-- Ulceritive Colitis", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[26].display))
        assertTrue(stringMatch("LA10557-9", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[27].code))
        assertTrue(stringMatch("-- Colon Polyps", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[27].display))
        assertTrue(stringMatch("LA10523-1", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[28].code))
        assertTrue(stringMatch("Heart Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[28].display))
        assertTrue(stringMatch("LA10558-7", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[29].code))
        assertTrue(stringMatch("-- Heart Attack", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[29].display))
        assertTrue(stringMatch("LA10526-4", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[30].code))
        assertTrue(stringMatch("High Cholesterol/Hyperlipidem", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[30].display))
        assertTrue(stringMatch("LA7444-8", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[31].code))
        assertTrue(stringMatch("Hypertension", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[31].display))
        assertTrue(stringMatch("LA10528-0", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[32].code))
        assertTrue(stringMatch("Kidney Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[32].display))
        assertTrue(stringMatch("LA10565-2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[33].code))
        assertTrue(stringMatch("-- Cystic Kidney Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[33].display))
        assertTrue(stringMatch("LA10566-0", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[34].code))
        assertTrue(stringMatch("-- Kidney Disease Present Fro", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[34].display))
        assertTrue(stringMatch("LA10567-8", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[35].code))
        assertTrue(stringMatch("-- Nephrosis", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[35].display))
        assertTrue(stringMatch("LA10568-6", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[36].code))
        assertTrue(stringMatch("-- Nephritis", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[36].display))
        assertTrue(stringMatch("LA10569-4", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[37].code))
        assertTrue(stringMatch("-- Nephrotic Syndrome", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[37].display))
        assertTrue(stringMatch("LA10570-2", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[38].code))
        assertTrue(stringMatch("-- Diabetic Kidney Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[38].display))
        assertTrue(stringMatch("LA10571-0", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[39].code))
        assertTrue(stringMatch("-- Other/Unknown", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[39].display))
        assertTrue(stringMatch("LA10531-4", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[40].code))
        assertTrue(stringMatch("Lung Disease", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[40].display))
        assertTrue(stringMatch("LA10559-5", (obj.entry[7].resource!! as ValueSet).compose!!.include[0].concept[41].code))
    }
}