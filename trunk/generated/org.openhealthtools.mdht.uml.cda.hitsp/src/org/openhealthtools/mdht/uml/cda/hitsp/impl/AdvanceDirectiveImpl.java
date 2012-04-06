/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.hitsp.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.hitsp.AdvanceDirective;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.operations.AdvanceDirectiveOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.AdvanceDirectiveObservationImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advance Directive</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class AdvanceDirectiveImpl extends AdvanceDirectiveObservationImpl implements AdvanceDirective {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdvanceDirectiveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HITSPPackage.Literals.ADVANCE_DIRECTIVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasStartingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasStartingTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasEndingTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasEndingTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasCustodian(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasCustodian(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveParticipantTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantTypeCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveParticipantRoleClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveParticipantRoleClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasAddress(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasAddress(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasTelecom(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasTelecom(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveHasNameOfAgent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveHasNameOfAgent(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdvanceDirectiveEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateAdvanceDirectiveObservationCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return AdvanceDirectiveOperations.validateAdvanceDirectiveObservationCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AdvanceDirective init() {
		CDAUtil.init(this);
		return this;
	}
} // AdvanceDirectiveImpl
