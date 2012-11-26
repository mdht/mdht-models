/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.eye.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.ihe.Medication;

import org.openhealthtools.mdht.uml.cda.ihe.eye.EyePackage;
import org.openhealthtools.mdht.uml.cda.ihe.eye.OphthalmicMedicationsSection;

import org.openhealthtools.mdht.uml.cda.ihe.eye.operations.OphthalmicMedicationsSectionOperations;
import org.openhealthtools.mdht.uml.cda.ihe.impl.MedicationsSectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ophthalmic Medications Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OphthalmicMedicationsSectionImpl extends MedicationsSectionImpl implements OphthalmicMedicationsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OphthalmicMedicationsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EyePackage.Literals.OPHTHALMIC_MEDICATIONS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OphthalmicMedicationsSectionOperations.validateOphthalmicMedicationsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOphthalmicMedicationsSectionMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OphthalmicMedicationsSectionOperations.validateOphthalmicMedicationsSectionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Medication getEyeMedication() {
		return OphthalmicMedicationsSectionOperations.getEyeMedication(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateMedicationsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return OphthalmicMedicationsSectionOperations.validateMedicationsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OphthalmicMedicationsSection init() {
	    return Initializer.Util.init(this);
	}
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
	public OphthalmicMedicationsSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} //OphthalmicMedicationsSectionImpl
