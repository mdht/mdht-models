package org.openhealthtools.mdht.uml.cda.qfdd;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Questionaire</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage#getQuestionaire()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='QuestionaireTemplateId QuestionaireCopyRightSection QuestionaireQuestionnaireFormDefinitionSection' templateId.root='2.16.840.1.113883.10.20.32'"
 * @generated
 */
public interface Questionaire extends QuestionaireHeader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::CopyRightSection))'"
	 * @generated
	 */
	boolean validateQuestionaireCopyRightSection(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->exists(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::QuestionnaireFormDefinitionSection))'"
	 * @generated
	 */
	boolean validateQuestionaireQuestionnaireFormDefinitionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::CopyRightSection)).oclAsType(qfdd::CopyRightSection)'"
	 * @generated
	 */
	EList<CopyRightSection> getCopyRightSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(qfdd::QuestionnaireFormDefinitionSection)).oclAsType(qfdd::QuestionnaireFormDefinitionSection)'"
	 * @generated
	 */
	EList<QuestionnaireFormDefinitionSection> getQuestionnaireFormDefinitionSections();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionaire init();

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Questionaire init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // Questionaire
