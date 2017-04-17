/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.InjuryRiskFactor;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.InjuryRiskFactorOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Injury Risk Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class InjuryRiskFactorImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements InjuryRiskFactor {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InjuryRiskFactorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.INJURY_RISK_FACTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryRiskFactorTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryRiskFactorOperations.validateInjuryRiskFactorTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryRiskFactorMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryRiskFactorOperations.validateInjuryRiskFactorMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryRiskFactorCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryRiskFactorOperations.validateInjuryRiskFactorCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInjuryRiskFactorValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return InjuryRiskFactorOperations.validateInjuryRiskFactorValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InjuryRiskFactor init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public InjuryRiskFactor init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // InjuryRiskFactorImpl
