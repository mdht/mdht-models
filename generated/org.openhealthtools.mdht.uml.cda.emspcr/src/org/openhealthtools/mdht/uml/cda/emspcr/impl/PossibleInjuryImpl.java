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
import org.openhealthtools.mdht.uml.cda.emspcr.PossibleInjury;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.PossibleInjuryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Possible Injury</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PossibleInjuryImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements PossibleInjury {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PossibleInjuryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.POSSIBLE_INJURY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleInjuryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PossibleInjuryOperations.validatePossibleInjuryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleInjuryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PossibleInjuryOperations.validatePossibleInjuryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleInjuryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PossibleInjuryOperations.validatePossibleInjuryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleInjuryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PossibleInjuryOperations.validatePossibleInjuryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePossibleInjuryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PossibleInjuryOperations.validatePossibleInjuryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PossibleInjury init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PossibleInjury init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // PossibleInjuryImpl
