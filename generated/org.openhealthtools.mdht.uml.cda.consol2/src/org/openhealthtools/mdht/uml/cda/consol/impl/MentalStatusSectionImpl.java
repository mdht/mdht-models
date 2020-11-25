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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;
import org.eclipse.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.consol.AssessmentScaleObservation;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusOrganizer2;
import org.openhealthtools.mdht.uml.cda.consol.MentalStatusSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MentalStatusSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mental Status Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MentalStatusSectionImpl extends SectionImpl implements MentalStatusSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MentalStatusSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MENTAL_STATUS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionAssessmentScaleObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionAssessmentScaleObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionMentalStatusOrganizer2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusOrganizer2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMentalStatusSectionMentalStatusObservation2(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return MentalStatusSectionOperations.validateMentalStatusSectionMentalStatusObservation2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AssessmentScaleObservation> getAssessmentScaleObservations() {
		return MentalStatusSectionOperations.getAssessmentScaleObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusOrganizer2> getMentalStatusOrganizer2s() {
		return MentalStatusSectionOperations.getMentalStatusOrganizer2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MentalStatusObservation2> getMentalStatusObservation2s() {
		return MentalStatusSectionOperations.getMentalStatusObservation2s(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MentalStatusSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public MentalStatusSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // MentalStatusSectionImpl
