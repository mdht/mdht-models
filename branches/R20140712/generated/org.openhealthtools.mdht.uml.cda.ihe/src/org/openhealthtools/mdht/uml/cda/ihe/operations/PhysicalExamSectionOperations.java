/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ihe.AbdomenSection;
import org.openhealthtools.mdht.uml.cda.ihe.BreastSection;
import org.openhealthtools.mdht.uml.cda.ihe.ChestWallSection;
import org.openhealthtools.mdht.uml.cda.ihe.EarsNoseMouthThroatSection;
import org.openhealthtools.mdht.uml.cda.ihe.EarsSection;
import org.openhealthtools.mdht.uml.cda.ihe.EndocrineSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ExtremitiesSection;
import org.openhealthtools.mdht.uml.cda.ihe.EyesSection;
import org.openhealthtools.mdht.uml.cda.ihe.GeneralAppearanceSection;
import org.openhealthtools.mdht.uml.cda.ihe.GenitaliaSection;
import org.openhealthtools.mdht.uml.cda.ihe.HeadSection;
import org.openhealthtools.mdht.uml.cda.ihe.HeartSection;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.IntegumentarySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.LymphaticSection;
import org.openhealthtools.mdht.uml.cda.ihe.MouthThroatTeethSection;
import org.openhealthtools.mdht.uml.cda.ihe.MusculoskeletalSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.NeckSection;
import org.openhealthtools.mdht.uml.cda.ihe.NeurologicSystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.NoseSection;
import org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection;
import org.openhealthtools.mdht.uml.cda.ihe.RectumSection;
import org.openhealthtools.mdht.uml.cda.ihe.RespiratorySystemSection;
import org.openhealthtools.mdht.uml.cda.ihe.ThoraxLungsSection;
import org.openhealthtools.mdht.uml.cda.ihe.VesselsSection;
import org.openhealthtools.mdht.uml.cda.ihe.VisibleImplantedMedicalDevicesSection;
import org.openhealthtools.mdht.uml.cda.ihe.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Physical Exam Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionGeneralAppearanceSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionIntegumentarySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionHeadSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEyesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEarsNoseMouthThroatSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEarsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNoseSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionMouthThroatTeethSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNeckSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionEndocrineSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionThoraxLungsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionChestWallSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionBreastSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionHeartSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionRespiratorySystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionAbdomenSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionLymphaticSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionVesselsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionMusculoskeletalSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionNeurologicSystemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionGenitaliaSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionRectumSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#validatePhysicalExamSectionExtremitiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Extremities Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVitalSignsSection() <em>Get Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getGeneralAppearanceSection() <em>Get General Appearance Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVisibleImplantedMedicalDevicesSection() <em>Get Visible Implanted Medical Devices Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getIntegumentarySystemSection() <em>Get Integumentary System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getHeadSection() <em>Get Head Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEyesSection() <em>Get Eyes Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEarsNoseMouthThroatSection() <em>Get Ears Nose Mouth Throat Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEarsSection() <em>Get Ears Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNoseSection() <em>Get Nose Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getMouthThroatTeethSection() <em>Get Mouth Throat Teeth Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNeckSection() <em>Get Neck Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getEndocrineSystemSection() <em>Get Endocrine System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getThoraxLungsSection() <em>Get Thorax Lungs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getChestWallSection() <em>Get Chest Wall Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getBreastSection() <em>Get Breast Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getHeartSection() <em>Get Heart Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getRespiratorySystemSection() <em>Get Respiratory System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getAbdomenSection() <em>Get Abdomen Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getLymphaticSection() <em>Get Lymphatic Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getVesselsSection() <em>Get Vessels Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getMusculoskeletalSystemSection() <em>Get Musculoskeletal System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getNeurologicSystemSection() <em>Get Neurologic System Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getGenitaliaSection() <em>Get Genitalia Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getRectumSection() <em>Get Rectum Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PhysicalExamSection#getExtremitiesSection() <em>Get Extremities Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PhysicalExamSectionOperations extends PhysicalExamNarrativeSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhysicalExamSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.1.9.15')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionTemplateId(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionTemplateId(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_TEMPLATE_ID,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionTemplateId"), new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionVitalSignsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVitalSignsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionVitalSignsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVitalSignsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionVitalSignsSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_VITAL_SIGNS_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionVitalSignsSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionGeneralAppearanceSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section General Appearance Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionGeneralAppearanceSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::GeneralAppearanceSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionGeneralAppearanceSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section General Appearance Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionGeneralAppearanceSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionGeneralAppearanceSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_GENERAL_APPEARANCE_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionGeneralAppearanceSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Visible Implanted Medical Devices Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VisibleImplantedMedicalDevicesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Visible Implanted Medical Devices Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionVisibleImplantedMedicalDevicesSection(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO,
					IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionVisibleImplantedMedicalDevicesSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionIntegumentarySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Integumentary System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionIntegumentarySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::IntegumentarySystemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionIntegumentarySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Integumentary System Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionIntegumentarySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionIntegumentarySystemSection(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_INTEGUMENTARY_SYSTEM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionIntegumentarySystemSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionHeadSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Head Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHeadSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HeadSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionHeadSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Head Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHeadSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionHeadSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_HEAD_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_HEAD_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionHeadSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionEyesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Eyes Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEyesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EyesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionEyesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Eyes Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEyesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionEyesSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_EYES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_EYES_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionEyesSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionEarsNoseMouthThroatSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Nose Mouth Throat Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEarsNoseMouthThroatSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EarsNoseMouthThroatSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionEarsNoseMouthThroatSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Nose Mouth Throat Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEarsNoseMouthThroatSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionEarsNoseMouthThroatSection(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_EARS_NOSE_MOUTH_THROAT_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionEarsNoseMouthThroatSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionEarsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEarsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EarsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionEarsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Ears Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEarsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionEarsSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_EARS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_EARS_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionEarsSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionNoseSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Nose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNoseSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NoseSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionNoseSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Nose Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNoseSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionNoseSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_NOSE_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_NOSE_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionNoseSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionMouthThroatTeethSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Mouth Throat Teeth Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionMouthThroatTeethSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MouthThroatTeethSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionMouthThroatTeethSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Mouth Throat Teeth Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionMouthThroatTeethSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionMouthThroatTeethSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_MOUTH_THROAT_TEETH_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionMouthThroatTeethSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionNeckSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neck Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNeckSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NeckSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionNeckSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neck Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNeckSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionNeckSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_NECK_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_NECK_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionNeckSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionEndocrineSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Endocrine System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEndocrineSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EndocrineSystemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionEndocrineSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Endocrine System Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionEndocrineSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionEndocrineSystemSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_ENDOCRINE_SYSTEM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionEndocrineSystemSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionThoraxLungsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Thorax Lungs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionThoraxLungsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ThoraxLungsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionThoraxLungsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Thorax Lungs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionThoraxLungsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionThoraxLungsSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_THORAX_LUNGS_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionThoraxLungsSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionChestWallSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Chest Wall Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionChestWallSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChestWallSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionChestWallSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Chest Wall Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionChestWallSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionChestWallSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_CHEST_WALL_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionChestWallSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionBreastSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Breast Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionBreastSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::BreastSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionBreastSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Breast Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionBreastSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionBreastSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_BREAST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_BREAST_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionBreastSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionHeartSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Heart Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHeartSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HeartSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionHeartSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Heart Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionHeartSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionHeartSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_HEART_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_HEART_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionHeartSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionRespiratorySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Respiratory System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionRespiratorySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::RespiratorySystemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionRespiratorySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Respiratory System Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionRespiratorySystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionRespiratorySystemSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_RESPIRATORY_SYSTEM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionRespiratorySystemSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionAbdomenSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Abdomen Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionAbdomenSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AbdomenSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionAbdomenSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Abdomen Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionAbdomenSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionAbdomenSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_ABDOMEN_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionAbdomenSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionLymphaticSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Lymphatic Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionLymphaticSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::LymphaticSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionLymphaticSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Lymphatic Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionLymphaticSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionLymphaticSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_LYMPHATIC_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionLymphaticSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionVesselsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vessels Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVesselsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VesselsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionVesselsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Vessels Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionVesselsSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionVesselsSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_VESSELS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_VESSELS_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionVesselsSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionMusculoskeletalSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Musculoskeletal System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionMusculoskeletalSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MusculoskeletalSystemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionMusculoskeletalSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Musculoskeletal System Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionMusculoskeletalSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionMusculoskeletalSystemSection(
			PhysicalExamSection physicalExamSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_MUSCULOSKELETAL_SYSTEM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionMusculoskeletalSystemSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionNeurologicSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neurologic System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNeurologicSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NeurologicSystemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionNeurologicSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Neurologic System Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionNeurologicSystemSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionNeurologicSystemSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_NEUROLOGIC_SYSTEM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionNeurologicSystemSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionGenitaliaSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Genitalia Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionGenitaliaSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::GenitaliaSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionGenitaliaSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Genitalia Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionGenitaliaSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionGenitaliaSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_GENITALIA_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_GENITALIA_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionGenitaliaSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionRectumSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Rectum Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionRectumSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::RectumSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionRectumSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Rectum Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionRectumSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionRectumSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_RECTUM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_RECTUM_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionRectumSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhysicalExamSectionExtremitiesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Extremities Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionExtremitiesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ExtremitiesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validatePhysicalExamSectionExtremitiesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Physical Exam Section Extremities Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhysicalExamSectionExtremitiesSection(PhysicalExamSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param physicalExamSection The receiving '<em><b>Physical Exam Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePhysicalExamSectionExtremitiesSection(PhysicalExamSection physicalExamSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(IHEPackage.Literals.PHYSICAL_EXAM_SECTION);
			try {
				VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			physicalExamSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.INFO, IHEValidator.DIAGNOSTIC_SOURCE,
					IHEValidator.PHYSICAL_EXAM_SECTION__PHYSICAL_EXAM_SECTION_EXTREMITIES_SECTION,
					IHEPlugin.INSTANCE.getString("PhysicalExamSectionExtremitiesSection"),
					new Object[] { physicalExamSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsSection(PhysicalExamSection) <em>Get Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VitalSignsSection))->asSequence()->any(true).oclAsType(ihe::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsSection(PhysicalExamSection) <em>Get Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VitalSignsSection getVitalSignsSection(PhysicalExamSection physicalExamSection) {
		if (GET_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(83));
			try {
				GET_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (VitalSignsSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGeneralAppearanceSection(PhysicalExamSection) <em>Get General Appearance Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralAppearanceSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENERAL_APPEARANCE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::GeneralAppearanceSection))->asSequence()->any(true).oclAsType(ihe::GeneralAppearanceSection)";

	/**
	 * The cached OCL query for the '{@link #getGeneralAppearanceSection(PhysicalExamSection) <em>Get General Appearance Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralAppearanceSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GeneralAppearanceSection getGeneralAppearanceSection(PhysicalExamSection physicalExamSection) {
		if (GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(84));
			try {
				GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY = helper.createQuery(GET_GENERAL_APPEARANCE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENERAL_APPEARANCE_SECTION__EOCL_QRY);
		return (GeneralAppearanceSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVisibleImplantedMedicalDevicesSection(PhysicalExamSection) <em>Get Visible Implanted Medical Devices Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleImplantedMedicalDevicesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VisibleImplantedMedicalDevicesSection))->asSequence()->any(true).oclAsType(ihe::VisibleImplantedMedicalDevicesSection)";

	/**
	 * The cached OCL query for the '{@link #getVisibleImplantedMedicalDevicesSection(PhysicalExamSection) <em>Get Visible Implanted Medical Devices Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibleImplantedMedicalDevicesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisibleImplantedMedicalDevicesSection getVisibleImplantedMedicalDevicesSection(
			PhysicalExamSection physicalExamSection) {
		if (GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(85));
			try {
				GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY = helper.createQuery(GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VISIBLE_IMPLANTED_MEDICAL_DEVICES_SECTION__EOCL_QRY);
		return (VisibleImplantedMedicalDevicesSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getIntegumentarySystemSection(PhysicalExamSection) <em>Get Integumentary System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegumentarySystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::IntegumentarySystemSection))->asSequence()->any(true).oclAsType(ihe::IntegumentarySystemSection)";

	/**
	 * The cached OCL query for the '{@link #getIntegumentarySystemSection(PhysicalExamSection) <em>Get Integumentary System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegumentarySystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntegumentarySystemSection getIntegumentarySystemSection(PhysicalExamSection physicalExamSection) {
		if (GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(86));
			try {
				GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INTEGUMENTARY_SYSTEM_SECTION__EOCL_QRY);
		return (IntegumentarySystemSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeadSection(PhysicalExamSection) <em>Get Head Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEAD_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HeadSection))->asSequence()->any(true).oclAsType(ihe::HeadSection)";

	/**
	 * The cached OCL query for the '{@link #getHeadSection(PhysicalExamSection) <em>Get Head Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeadSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEAD_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeadSection getHeadSection(PhysicalExamSection physicalExamSection) {
		if (GET_HEAD_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(87));
			try {
				GET_HEAD_SECTION__EOCL_QRY = helper.createQuery(GET_HEAD_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEAD_SECTION__EOCL_QRY);
		return (HeadSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEyesSection(PhysicalExamSection) <em>Get Eyes Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EYES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EyesSection))->asSequence()->any(true).oclAsType(ihe::EyesSection)";

	/**
	 * The cached OCL query for the '{@link #getEyesSection(PhysicalExamSection) <em>Get Eyes Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEyesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EYES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EyesSection getEyesSection(PhysicalExamSection physicalExamSection) {
		if (GET_EYES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(88));
			try {
				GET_EYES_SECTION__EOCL_QRY = helper.createQuery(GET_EYES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EYES_SECTION__EOCL_QRY);
		return (EyesSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEarsNoseMouthThroatSection(PhysicalExamSection) <em>Get Ears Nose Mouth Throat Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsNoseMouthThroatSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EarsNoseMouthThroatSection))->asSequence()->any(true).oclAsType(ihe::EarsNoseMouthThroatSection)";

	/**
	 * The cached OCL query for the '{@link #getEarsNoseMouthThroatSection(PhysicalExamSection) <em>Get Ears Nose Mouth Throat Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsNoseMouthThroatSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EarsNoseMouthThroatSection getEarsNoseMouthThroatSection(PhysicalExamSection physicalExamSection) {
		if (GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(89));
			try {
				GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY = helper.createQuery(GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EARS_NOSE_MOUTH_THROAT_SECTION__EOCL_QRY);
		return (EarsNoseMouthThroatSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEarsSection(PhysicalExamSection) <em>Get Ears Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EARS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EarsSection))->asSequence()->any(true).oclAsType(ihe::EarsSection)";

	/**
	 * The cached OCL query for the '{@link #getEarsSection(PhysicalExamSection) <em>Get Ears Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EARS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EarsSection getEarsSection(PhysicalExamSection physicalExamSection) {
		if (GET_EARS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(90));
			try {
				GET_EARS_SECTION__EOCL_QRY = helper.createQuery(GET_EARS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EARS_SECTION__EOCL_QRY);
		return (EarsSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNoseSection(PhysicalExamSection) <em>Get Nose Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NOSE_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NoseSection))->asSequence()->any(true).oclAsType(ihe::NoseSection)";

	/**
	 * The cached OCL query for the '{@link #getNoseSection(PhysicalExamSection) <em>Get Nose Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoseSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NOSE_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoseSection getNoseSection(PhysicalExamSection physicalExamSection) {
		if (GET_NOSE_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(91));
			try {
				GET_NOSE_SECTION__EOCL_QRY = helper.createQuery(GET_NOSE_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NOSE_SECTION__EOCL_QRY);
		return (NoseSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMouthThroatTeethSection(PhysicalExamSection) <em>Get Mouth Throat Teeth Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouthThroatTeethSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MOUTH_THROAT_TEETH_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MouthThroatTeethSection))->asSequence()->any(true).oclAsType(ihe::MouthThroatTeethSection)";

	/**
	 * The cached OCL query for the '{@link #getMouthThroatTeethSection(PhysicalExamSection) <em>Get Mouth Throat Teeth Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMouthThroatTeethSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MouthThroatTeethSection getMouthThroatTeethSection(PhysicalExamSection physicalExamSection) {
		if (GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(92));
			try {
				GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY = helper.createQuery(GET_MOUTH_THROAT_TEETH_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MOUTH_THROAT_TEETH_SECTION__EOCL_QRY);
		return (MouthThroatTeethSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNeckSection(PhysicalExamSection) <em>Get Neck Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeckSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NECK_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NeckSection))->asSequence()->any(true).oclAsType(ihe::NeckSection)";

	/**
	 * The cached OCL query for the '{@link #getNeckSection(PhysicalExamSection) <em>Get Neck Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeckSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NECK_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NeckSection getNeckSection(PhysicalExamSection physicalExamSection) {
		if (GET_NECK_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(93));
			try {
				GET_NECK_SECTION__EOCL_QRY = helper.createQuery(GET_NECK_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NECK_SECTION__EOCL_QRY);
		return (NeckSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getEndocrineSystemSection(PhysicalExamSection) <em>Get Endocrine System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndocrineSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ENDOCRINE_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::EndocrineSystemSection))->asSequence()->any(true).oclAsType(ihe::EndocrineSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getEndocrineSystemSection(PhysicalExamSection) <em>Get Endocrine System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndocrineSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EndocrineSystemSection getEndocrineSystemSection(PhysicalExamSection physicalExamSection) {
		if (GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(94));
			try {
				GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_ENDOCRINE_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ENDOCRINE_SYSTEM_SECTION__EOCL_QRY);
		return (EndocrineSystemSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getThoraxLungsSection(PhysicalExamSection) <em>Get Thorax Lungs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoraxLungsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_THORAX_LUNGS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ThoraxLungsSection))->asSequence()->any(true).oclAsType(ihe::ThoraxLungsSection)";

	/**
	 * The cached OCL query for the '{@link #getThoraxLungsSection(PhysicalExamSection) <em>Get Thorax Lungs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThoraxLungsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_THORAX_LUNGS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ThoraxLungsSection getThoraxLungsSection(PhysicalExamSection physicalExamSection) {
		if (GET_THORAX_LUNGS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(95));
			try {
				GET_THORAX_LUNGS_SECTION__EOCL_QRY = helper.createQuery(GET_THORAX_LUNGS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_THORAX_LUNGS_SECTION__EOCL_QRY);
		return (ThoraxLungsSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getChestWallSection(PhysicalExamSection) <em>Get Chest Wall Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChestWallSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHEST_WALL_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ChestWallSection))->asSequence()->any(true).oclAsType(ihe::ChestWallSection)";

	/**
	 * The cached OCL query for the '{@link #getChestWallSection(PhysicalExamSection) <em>Get Chest Wall Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChestWallSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHEST_WALL_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChestWallSection getChestWallSection(PhysicalExamSection physicalExamSection) {
		if (GET_CHEST_WALL_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(96));
			try {
				GET_CHEST_WALL_SECTION__EOCL_QRY = helper.createQuery(GET_CHEST_WALL_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHEST_WALL_SECTION__EOCL_QRY);
		return (ChestWallSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getBreastSection(PhysicalExamSection) <em>Get Breast Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BREAST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::BreastSection))->asSequence()->any(true).oclAsType(ihe::BreastSection)";

	/**
	 * The cached OCL query for the '{@link #getBreastSection(PhysicalExamSection) <em>Get Breast Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBreastSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BREAST_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BreastSection getBreastSection(PhysicalExamSection physicalExamSection) {
		if (GET_BREAST_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(97));
			try {
				GET_BREAST_SECTION__EOCL_QRY = helper.createQuery(GET_BREAST_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BREAST_SECTION__EOCL_QRY);
		return (BreastSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getHeartSection(PhysicalExamSection) <em>Get Heart Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEART_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::HeartSection))->asSequence()->any(true).oclAsType(ihe::HeartSection)";

	/**
	 * The cached OCL query for the '{@link #getHeartSection(PhysicalExamSection) <em>Get Heart Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeartSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEART_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeartSection getHeartSection(PhysicalExamSection physicalExamSection) {
		if (GET_HEART_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(98));
			try {
				GET_HEART_SECTION__EOCL_QRY = helper.createQuery(GET_HEART_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HEART_SECTION__EOCL_QRY);
		return (HeartSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRespiratorySystemSection(PhysicalExamSection) <em>Get Respiratory System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespiratorySystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESPIRATORY_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::RespiratorySystemSection))->asSequence()->any(true).oclAsType(ihe::RespiratorySystemSection)";

	/**
	 * The cached OCL query for the '{@link #getRespiratorySystemSection(PhysicalExamSection) <em>Get Respiratory System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespiratorySystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RespiratorySystemSection getRespiratorySystemSection(PhysicalExamSection physicalExamSection) {
		if (GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(99));
			try {
				GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_RESPIRATORY_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESPIRATORY_SYSTEM_SECTION__EOCL_QRY);
		return (RespiratorySystemSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAbdomenSection(PhysicalExamSection) <em>Get Abdomen Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbdomenSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ABDOMEN_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::AbdomenSection))->asSequence()->any(true).oclAsType(ihe::AbdomenSection)";

	/**
	 * The cached OCL query for the '{@link #getAbdomenSection(PhysicalExamSection) <em>Get Abdomen Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbdomenSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ABDOMEN_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AbdomenSection getAbdomenSection(PhysicalExamSection physicalExamSection) {
		if (GET_ABDOMEN_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(100));
			try {
				GET_ABDOMEN_SECTION__EOCL_QRY = helper.createQuery(GET_ABDOMEN_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ABDOMEN_SECTION__EOCL_QRY);
		return (AbdomenSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLymphaticSection(PhysicalExamSection) <em>Get Lymphatic Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLymphaticSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LYMPHATIC_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::LymphaticSection))->asSequence()->any(true).oclAsType(ihe::LymphaticSection)";

	/**
	 * The cached OCL query for the '{@link #getLymphaticSection(PhysicalExamSection) <em>Get Lymphatic Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLymphaticSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LYMPHATIC_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LymphaticSection getLymphaticSection(PhysicalExamSection physicalExamSection) {
		if (GET_LYMPHATIC_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(101));
			try {
				GET_LYMPHATIC_SECTION__EOCL_QRY = helper.createQuery(GET_LYMPHATIC_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LYMPHATIC_SECTION__EOCL_QRY);
		return (LymphaticSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getVesselsSection(PhysicalExamSection) <em>Get Vessels Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VESSELS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::VesselsSection))->asSequence()->any(true).oclAsType(ihe::VesselsSection)";

	/**
	 * The cached OCL query for the '{@link #getVesselsSection(PhysicalExamSection) <em>Get Vessels Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVesselsSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VESSELS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VesselsSection getVesselsSection(PhysicalExamSection physicalExamSection) {
		if (GET_VESSELS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(102));
			try {
				GET_VESSELS_SECTION__EOCL_QRY = helper.createQuery(GET_VESSELS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VESSELS_SECTION__EOCL_QRY);
		return (VesselsSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getMusculoskeletalSystemSection(PhysicalExamSection) <em>Get Musculoskeletal System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusculoskeletalSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::MusculoskeletalSystemSection))->asSequence()->any(true).oclAsType(ihe::MusculoskeletalSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getMusculoskeletalSystemSection(PhysicalExamSection) <em>Get Musculoskeletal System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMusculoskeletalSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MusculoskeletalSystemSection getMusculoskeletalSystemSection(PhysicalExamSection physicalExamSection) {
		if (GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(103));
			try {
				GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MUSCULOSKELETAL_SYSTEM_SECTION__EOCL_QRY);
		return (MusculoskeletalSystemSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNeurologicSystemSection(PhysicalExamSection) <em>Get Neurologic System Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurologicSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::NeurologicSystemSection))->asSequence()->any(true).oclAsType(ihe::NeurologicSystemSection)";

	/**
	 * The cached OCL query for the '{@link #getNeurologicSystemSection(PhysicalExamSection) <em>Get Neurologic System Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeurologicSystemSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NeurologicSystemSection getNeurologicSystemSection(PhysicalExamSection physicalExamSection) {
		if (GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(104));
			try {
				GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY = helper.createQuery(GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NEUROLOGIC_SYSTEM_SECTION__EOCL_QRY);
		return (NeurologicSystemSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getGenitaliaSection(PhysicalExamSection) <em>Get Genitalia Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenitaliaSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_GENITALIA_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::GenitaliaSection))->asSequence()->any(true).oclAsType(ihe::GenitaliaSection)";

	/**
	 * The cached OCL query for the '{@link #getGenitaliaSection(PhysicalExamSection) <em>Get Genitalia Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenitaliaSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_GENITALIA_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenitaliaSection getGenitaliaSection(PhysicalExamSection physicalExamSection) {
		if (GET_GENITALIA_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(105));
			try {
				GET_GENITALIA_SECTION__EOCL_QRY = helper.createQuery(GET_GENITALIA_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_GENITALIA_SECTION__EOCL_QRY);
		return (GenitaliaSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRectumSection(PhysicalExamSection) <em>Get Rectum Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectumSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECTUM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::RectumSection))->asSequence()->any(true).oclAsType(ihe::RectumSection)";

	/**
	 * The cached OCL query for the '{@link #getRectumSection(PhysicalExamSection) <em>Get Rectum Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRectumSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECTUM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RectumSection getRectumSection(PhysicalExamSection physicalExamSection) {
		if (GET_RECTUM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(106));
			try {
				GET_RECTUM_SECTION__EOCL_QRY = helper.createQuery(GET_RECTUM_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECTUM_SECTION__EOCL_QRY);
		return (RectumSection) query.evaluate(physicalExamSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getExtremitiesSection(PhysicalExamSection) <em>Get Extremities Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EXTREMITIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(ihe::ExtremitiesSection))->asSequence()->any(true).oclAsType(ihe::ExtremitiesSection)";

	/**
	 * The cached OCL query for the '{@link #getExtremitiesSection(PhysicalExamSection) <em>Get Extremities Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtremitiesSection(PhysicalExamSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EXTREMITIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtremitiesSection getExtremitiesSection(PhysicalExamSection physicalExamSection) {
		if (GET_EXTREMITIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION,
				IHEPackage.Literals.PHYSICAL_EXAM_SECTION.getEAllOperations().get(107));
			try {
				GET_EXTREMITIES_SECTION__EOCL_QRY = helper.createQuery(GET_EXTREMITIES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EXTREMITIES_SECTION__EOCL_QRY);
		return (ExtremitiesSection) query.evaluate(physicalExamSection);
	}

} // PhysicalExamSectionOperations
