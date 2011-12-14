/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.PreconditionForSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.consol.operations.PreconditionForSubstanceAdministrationOperations;

import org.openhealthtools.mdht.uml.cda.impl.PreconditionImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Precondition For Substance Administration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PreconditionForSubstanceAdministrationImpl extends PreconditionImpl implements
		PreconditionForSubstanceAdministration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreconditionForSubstanceAdministrationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PRECONDITION_FOR_SUBSTANCE_ADMINISTRATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationCriterionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationCriterionText(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationCriterionValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationCriterionValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreconditionForSubstanceAdministrationTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PreconditionForSubstanceAdministrationOperations.validatePreconditionForSubstanceAdministrationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreconditionForSubstanceAdministration init() {
    	CDAUtil.init(this);
    	return this;
	}
} // PreconditionForSubstanceAdministrationImpl
