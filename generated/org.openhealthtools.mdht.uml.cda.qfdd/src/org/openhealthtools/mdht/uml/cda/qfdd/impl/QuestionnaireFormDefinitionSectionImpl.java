/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionsOrganizer;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionnaireFormDefinitionSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Form Definition Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionnaireFormDefinitionSectionImpl extends SectionImpl implements QuestionnaireFormDefinitionSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireFormDefinitionSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTIONNAIRE_FORM_DEFINITION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionLanguageCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionLanguageCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireFormDefinitionSectionOperations.validateQuestionnaireFormDefinitionSectionQuestionsOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionsOrganizer> getQuestionsOrganizers() {
		return QuestionnaireFormDefinitionSectionOperations.getQuestionsOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireFormDefinitionSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public QuestionnaireFormDefinitionSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionnaireFormDefinitionSectionImpl
