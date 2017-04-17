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
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacArrest;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSCardiacArrestEventSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSCardiacArrestEventSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Cardiac Arrest Event Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EMSCardiacArrestEventSectionImpl extends org.eclipse.mdht.uml.cda.impl.SectionImpl implements EMSCardiacArrestEventSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMSCardiacArrestEventSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_CARDIAC_ARREST_EVENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEMSCardiacArrestEventSectionCardiacArrestExistence(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return EMSCardiacArrestEventSectionOperations.validateEMSCardiacArrestEventSectionCardiacArrestExistence(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardiacArrest getCardiacArrestExistence() {
		return EMSCardiacArrestEventSectionOperations.getCardiacArrestExistence(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSCardiacArrestEventSection init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMSCardiacArrestEventSection init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // EMSCardiacArrestEventSectionImpl
