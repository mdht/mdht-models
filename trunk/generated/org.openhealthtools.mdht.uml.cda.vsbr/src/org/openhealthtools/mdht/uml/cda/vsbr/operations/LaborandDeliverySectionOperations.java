/**
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcedureSection;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryProcess;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.MothersVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.OnsetofLabor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborAndDeliveryProcess(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Process</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionLaborOnsets(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor Onsets</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#validateLaborandDeliverySectionMothersVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mothers Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborAndDeliveryProcess() <em>Get Labor And Delivery Process</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborAndDeliveryProceduresSection() <em>Get Labor And Delivery Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getLaborOnsetss() <em>Get Labor Onsetss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliverySection#getMothersVitalSignsSection() <em>Get Mothers Vital Signs Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliverySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaborandDeliverySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.8')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionTemplateId(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionTemplateId(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionClassCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionClassCode(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionMoodCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionMoodCode(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '34079-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionCode(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionCode(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionText(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionText(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_TEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionText",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionLaborAndDeliveryProcess(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborAndDeliveryProcess(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(vsbr::Labor and Delivery Process) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionLaborAndDeliveryProcess(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Process</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborAndDeliveryProcess(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionLaborAndDeliveryProcess(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCESS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionLaborAndDeliveryProcess",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Procedure Section))";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor And Delivery Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionLaborAndDeliveryProceduresSection(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_AND_DELIVERY_PROCEDURES_SECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionLaborAndDeliveryProceduresSection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionLaborOnsets(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor Onsets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborOnsets(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Onset of Labor) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionLaborOnsets(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Labor Onsets</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionLaborOnsets(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionLaborOnsets(LaborandDeliverySection laborandDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_SECTION_LABOR_ONSETS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_LABOR_ONSETS,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionLaborOnsets",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateLaborandDeliverySectionMothersVitalSignsSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mothers Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionMothersVitalSignsSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Mothers Vital Signs Section))";

	/**
	 * The cached OCL invariant for the '{@link #validateLaborandDeliverySectionMothersVitalSignsSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Section Mothers Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateLaborandDeliverySectionMothersVitalSignsSection(LaborandDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param laborandDeliverySection The receiving '<em><b>Laborand Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateLaborandDeliverySectionMothersVitalSignsSection(
			LaborandDeliverySection laborandDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_SECTION);
			try {
				VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			laborandDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.LABORAND_DELIVERY_SECTION__LABORAND_DELIVERY_SECTION_MOTHERS_VITAL_SIGNS_SECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"LaborandDeliverySectionMothersVitalSignsSection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									laborandDeliverySection, context) }), new Object[] { laborandDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLaborAndDeliveryProcess(LaborandDeliverySection) <em>Get Labor And Delivery Process</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborAndDeliveryProcess(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LABOR_AND_DELIVERY_PROCESS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(vsbr::Labor and Delivery Process))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Process)";

	/**
	 * The cached OCL query for the '{@link #getLaborAndDeliveryProcess(LaborandDeliverySection) <em>Get Labor And Delivery Process</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborAndDeliveryProcess(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LABOR_AND_DELIVERY_PROCESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LaborandDeliveryProcess getLaborAndDeliveryProcess(LaborandDeliverySection laborandDeliverySection) {
		if (GET_LABOR_AND_DELIVERY_PROCESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(64));
			try {
				GET_LABOR_AND_DELIVERY_PROCESS__EOCL_QRY = helper.createQuery(GET_LABOR_AND_DELIVERY_PROCESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LABOR_AND_DELIVERY_PROCESS__EOCL_QRY);
		return (LaborandDeliveryProcess) query.evaluate(laborandDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLaborAndDeliveryProceduresSection(LaborandDeliverySection) <em>Get Labor And Delivery Procedures Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborAndDeliveryProceduresSection(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Labor and Delivery Procedure Section))->asSequence()->any(true).oclAsType(vsbr::Labor and Delivery Procedure Section)";

	/**
	 * The cached OCL query for the '{@link #getLaborAndDeliveryProceduresSection(LaborandDeliverySection) <em>Get Labor And Delivery Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborAndDeliveryProceduresSection(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static LaborandDeliveryProcedureSection getLaborAndDeliveryProceduresSection(
			LaborandDeliverySection laborandDeliverySection) {
		if (GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(65));
			try {
				GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LABOR_AND_DELIVERY_PROCEDURES_SECTION__EOCL_QRY);
		return (LaborandDeliveryProcedureSection) query.evaluate(laborandDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getLaborOnsetss(LaborandDeliverySection) <em>Get Labor Onsetss</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborOnsetss(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LABOR_ONSETSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Onset of Labor)).oclAsType(vsbr::Onset of Labor)";

	/**
	 * The cached OCL query for the '{@link #getLaborOnsetss(LaborandDeliverySection) <em>Get Labor Onsetss</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLaborOnsetss(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LABOR_ONSETSS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<OnsetofLabor> getLaborOnsetss(LaborandDeliverySection laborandDeliverySection) {
		if (GET_LABOR_ONSETSS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(66));
			try {
				GET_LABOR_ONSETSS__EOCL_QRY = helper.createQuery(GET_LABOR_ONSETSS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LABOR_ONSETSS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<OnsetofLabor> result = (Collection<OnsetofLabor>) query.evaluate(laborandDeliverySection);
		return new BasicEList.UnmodifiableEList<OnsetofLabor>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getMothersVitalSignsSection(LaborandDeliverySection) <em>Get Mothers Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMothersVitalSignsSection(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::Mothers Vital Signs Section))->asSequence()->any(true).oclAsType(vsbr::Mothers Vital Signs Section)";

	/**
	 * The cached OCL query for the '{@link #getMothersVitalSignsSection(LaborandDeliverySection) <em>Get Mothers Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMothersVitalSignsSection(LaborandDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static MothersVitalSignsSection getMothersVitalSignsSection(LaborandDeliverySection laborandDeliverySection) {
		if (GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION,
				VsbrPackage.Literals.LABORAND_DELIVERY_SECTION.getEAllOperations().get(67));
			try {
				GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MOTHERS_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (MothersVitalSignsSection) query.evaluate(laborandDeliverySection);
	}

} // LaborandDeliverySectionOperations
