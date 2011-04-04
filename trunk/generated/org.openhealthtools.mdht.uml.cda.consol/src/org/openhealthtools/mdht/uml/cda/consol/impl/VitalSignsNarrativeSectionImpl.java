/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.VitalSignsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.VitalSignsNarrativeSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vital Signs Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VitalSignsNarrativeSectionImpl extends SectionImpl implements VitalSignsNarrativeSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VitalSignsNarrativeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.VITAL_SIGNS_NARRATIVE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsNarrativeSectionOperations.validateVitalSignsNarrativeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsNarrativeSectionOperations.validateVitalSignsNarrativeSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsNarrativeSectionOperations.validateVitalSignsNarrativeSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVitalSignsNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return VitalSignsNarrativeSectionOperations.validateVitalSignsNarrativeSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VitalSignsNarrativeSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //VitalSignsNarrativeSectionImpl
