/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.ActImpl;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.SubstanceAdministeredAct;
import org.openhealthtools.mdht.uml.cda.consol.operations.SubstanceAdministeredActOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substance Administered Act</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class SubstanceAdministeredActImpl extends ActImpl implements SubstanceAdministeredAct {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstanceAdministeredActImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.SUBSTANCE_ADMINISTERED_ACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActStatusCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActStatusCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActStatusCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActStatusCodeP(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateSubstanceAdministeredActEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return SubstanceAdministeredActOperations.validateSubstanceAdministeredActEffectiveTime(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAdministeredAct init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SubstanceAdministeredAct init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // SubstanceAdministeredActImpl
