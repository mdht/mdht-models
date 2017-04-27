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
import org.openhealthtools.mdht.uml.cda.emspcr.ExistenceOfNonDrugAllergy;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ExistenceOfNonDrugAllergyOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Existence Of Non Drug Allergy</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExistenceOfNonDrugAllergyImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ExistenceOfNonDrugAllergy {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExistenceOfNonDrugAllergyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EXISTENCE_OF_NON_DRUG_ALLERGY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfNonDrugAllergyTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfNonDrugAllergyMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfNonDrugAllergyCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExistenceOfNonDrugAllergyValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ExistenceOfNonDrugAllergyOperations.validateExistenceOfNonDrugAllergyValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistenceOfNonDrugAllergy init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ExistenceOfNonDrugAllergy init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ExistenceOfNonDrugAllergyImpl
