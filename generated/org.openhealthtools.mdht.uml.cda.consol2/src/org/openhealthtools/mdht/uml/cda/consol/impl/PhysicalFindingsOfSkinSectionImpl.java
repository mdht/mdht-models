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
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.LongitudinalCareWoundObservation;
import org.openhealthtools.mdht.uml.cda.consol.PhysicalFindingsOfSkinSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.PhysicalFindingsOfSkinSectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Physical Findings Of Skin Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PhysicalFindingsOfSkinSectionImpl extends SectionImpl implements PhysicalFindingsOfSkinSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalFindingsOfSkinSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PHYSICAL_FINDINGS_OF_SKIN_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionTitle(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePhysicalFindingsOfSkinSectionWoundObservation(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PhysicalFindingsOfSkinSectionOperations.validatePhysicalFindingsOfSkinSectionWoundObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LongitudinalCareWoundObservation> getWoundObservations() {
		return PhysicalFindingsOfSkinSectionOperations.getWoundObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhysicalFindingsOfSkinSection init() {
	    return Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public PhysicalFindingsOfSkinSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // PhysicalFindingsOfSkinSectionImpl
