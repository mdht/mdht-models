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
import org.openhealthtools.mdht.uml.cda.consol.MedicationsNarrativeSection;
import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsNarrativeSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medications Narrative Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationsNarrativeSectionImpl extends SectionImpl implements MedicationsNarrativeSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MedicationsNarrativeSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.MEDICATIONS_NARRATIVE_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsNarrativeSectionOperations.validateMedicationsNarrativeSectionTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsNarrativeSectionOperations.validateMedicationsNarrativeSectionCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsNarrativeSectionOperations.validateMedicationsNarrativeSectionTitle(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMedicationsNarrativeSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MedicationsNarrativeSectionOperations.validateMedicationsNarrativeSectionText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicationsNarrativeSection init() {
    		CDAUtil.init(this);
    		return this;
	}
} //MedicationsNarrativeSectionImpl
