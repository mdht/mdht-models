/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.ihe.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.ProblemEntry;
import org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.operations.VisibleImplantedMedicalDevicesSectionOperations;
import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visible Implanted Medical Devices Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class VisibleImplantedMedicalDevicesSectionImpl extends SectionImpl implements
		VisibleImplantedMedicalDevicesSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibleImplantedMedicalDevicesSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IHEPackage.Literals.VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionTemplateId(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionCode(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVisibleImplantedMedicalDevicesSectionProblemEntry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return VisibleImplantedMedicalDevicesSectionOperations.validateVisibleImplantedMedicalDevicesSectionProblemEntry(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemEntry getProblemEntry() {
		return VisibleImplantedMedicalDevicesSectionOperations.getProblemEntry(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibleImplantedMedicalDevicesSection init() {
		CDAUtil.init(this);
		return this;
	}
} // VisibleImplantedMedicalDevicesSectionImpl
