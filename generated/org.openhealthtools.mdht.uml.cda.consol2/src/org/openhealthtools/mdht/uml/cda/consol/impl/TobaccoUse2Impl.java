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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.TobaccoUse2;
import org.openhealthtools.mdht.uml.cda.consol.operations.TobaccoUse2Operations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tobacco Use2</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TobaccoUse2Impl extends TobaccoUseImpl implements TobaccoUse2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TobaccoUse2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.TOBACCO_USE2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUse2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUse2TemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUse2Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUse2Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUseCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUseCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUse2AuthorParticipation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUse2AuthorParticipation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUse2CDCodeTermAssertionOrLoinc(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUse2CDCodeTermAssertionOrLoinc(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTobaccoUse2IVLTSHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUse2IVLTSHigh(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUseCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateTobaccoUseEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TobaccoUse2Operations.validateTobaccoUseEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TobaccoUse2 init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public TobaccoUse2 init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // TobaccoUse2Impl
