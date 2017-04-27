package org.openhealthtools.mdht.uml.cda.qfdd.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightSection;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.Questionaire;
import org.openhealthtools.mdht.uml.cda.qfdd.QuestionnaireFormDefinitionSection;
import org.openhealthtools.mdht.uml.cda.qfdd.operations.QuestionaireOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionaire</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class QuestionaireImpl extends QuestionaireHeaderImpl implements Questionaire {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QFDDPackage.Literals.QUESTIONAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireCopyRightSection(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireOperations.validateQuestionaireCopyRightSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionaireQuestionnaireFormDefinitionSection(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return QuestionaireOperations.validateQuestionaireQuestionnaireFormDefinitionSection(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CopyRightSection> getCopyRightSections() {
		return QuestionaireOperations.getCopyRightSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QuestionnaireFormDefinitionSection> getQuestionnaireFormDefinitionSections() {
		return QuestionaireOperations.getQuestionnaireFormDefinitionSections(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateQuestionaireHeaderTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return QuestionaireOperations.validateQuestionaireHeaderTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Questionaire init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Questionaire init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // QuestionaireImpl
