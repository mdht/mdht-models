/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.AdditionalVitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSVitalSignsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Vital Signs Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSVitalSignsSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl implements EMSVitalSignsSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSVitalSignsSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_VITAL_SIGNS_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionVitalSignsOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionVitalSignsOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSVitalSignsSectionAdditionalVitalSignsOrganizer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSVitalSignsSectionOperations.validateEMSVitalSignsSectionAdditionalVitalSignsOrganizer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VitalSignsOrganizer> getVitalSignsOrganizers() {
		return EMSVitalSignsSectionOperations.getVitalSignsOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalVitalSignsOrganizer> getAdditionalVitalSignsOrganizers() {
		return EMSVitalSignsSectionOperations.getAdditionalVitalSignsOrganizers(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSVitalSignsSection init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSVitalSignsSection init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSVitalSignsSectionImpl
