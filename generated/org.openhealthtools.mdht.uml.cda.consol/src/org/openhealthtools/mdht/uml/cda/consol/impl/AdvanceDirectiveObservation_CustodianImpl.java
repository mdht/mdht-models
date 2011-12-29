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

import org.openhealthtools.mdht.uml.cda.consol.AdvanceDirectiveObservation_Custodian;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

import org.openhealthtools.mdht.uml.cda.consol.operations.AdvanceDirectiveObservation_CustodianOperations;

import org.openhealthtools.mdht.uml.cda.impl.Participant2Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive Observation Custodian</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveObservation_CustodianImpl extends Participant2Impl implements
		AdvanceDirectiveObservation_Custodian {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveObservation_CustodianImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.ADVANCE_DIRECTIVE_OBSERVATION_CUSTODIAN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveObservation_CustodianOperations.validateCustodianTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustodianAdvanceDirectiveObservationCustodianRole(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveObservation_CustodianOperations.validateCustodianAdvanceDirectiveObservationCustodianRole(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdvanceDirectiveObservation_Custodian init() {
		CDAUtil.init(this);
		return this;
	}
} // AdvanceDirectiveObservation_CustodianImpl
