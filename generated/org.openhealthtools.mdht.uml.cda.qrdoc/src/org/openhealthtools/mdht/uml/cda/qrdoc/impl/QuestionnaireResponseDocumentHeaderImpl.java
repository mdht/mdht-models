/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ClinicalDocumentImpl;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QuestionnaireResponseDocumentHeader;
import org.openhealthtools.mdht.uml.cda.qrdoc.operations.QuestionnaireResponseDocumentHeaderOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire Response Document Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionnaireResponseDocumentHeaderImpl extends ClinicalDocumentImpl implements
		QuestionnaireResponseDocumentHeader {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireResponseDocumentHeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QRDOCPackage.Literals.QUESTIONNAIRE_RESPONSE_DOCUMENT_HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderConfidentialityCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderConfidentialityCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderLanguageCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderLanguageCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderRealmCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderRealmCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderTypeId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderTypeId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderRecordTarget(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderRecordTarget(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderAuthor(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderDataEnterer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderDataEnterer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderInformant(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderInformant(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderCustodian(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderInformationRecipient(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderInformationRecipient(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderLegalAuthenticator(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionnaireResponseDocumentHeaderOperations.validateQuestionnaireResponseDocumentHeaderInFulfillmentOf(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionnaireResponseDocumentHeader init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public QuestionnaireResponseDocumentHeader init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionnaireResponseDocumentHeaderImpl
