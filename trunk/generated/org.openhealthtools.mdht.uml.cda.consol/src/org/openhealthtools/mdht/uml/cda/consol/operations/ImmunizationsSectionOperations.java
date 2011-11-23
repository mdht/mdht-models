/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

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

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationActivity;
import org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Immunizations Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionHasMedicationOrSupplyActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Has Medication Or Supply Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionImmunization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Immunization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#getnullImmunizations() <em>Getnull Immunizations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImmunizationsSection#validateImmunizationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationsSectionOperations extends ImmunizationsSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionHasMedicationOrSupplyActivity(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Has Medication Or Supply Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionHasMedicationOrSupplyActivity(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(ccd::MedicationActivity))"+
"   or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(ccd::SupplyActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionHasMedicationOrSupplyActivity(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Has Medication Or Supply Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionHasMedicationOrSupplyActivity(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->exists(activity : cda::SubstanceAdministration | activity.oclIsKindOf(ccd::MedicationActivity))
	 *    or self.getSupplies()->exists(activity : cda::Supply | activity.oclIsKindOf(ccd::SupplyActivity))
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionHasMedicationOrSupplyActivity(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_HAS_MEDICATION_OR_SUPPLY_ACTIVITY,
						 ConsolPlugin.INSTANCE.getString("ImmunizationsSectionHasMedicationOrSupplyActivity"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("+
"value.code = '11369-6' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '11369-6' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionEntriesOptionalCode(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_CODE,
						 ConsolPlugin.INSTANCE.getString("ImmunizationsSectionEntriesOptionalCode"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionTitle(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTitle(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionTitle(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionTitle(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionTitle(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TITLE,
						 ConsolPlugin.INSTANCE.getString("ImmunizationsSectionTitle"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionText(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionText(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionText(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionText(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionText(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_TEXT,
						 ConsolPlugin.INSTANCE.getString("ImmunizationsSectionText"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Immunization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Immunization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionImmunization(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(consol::ImmunizationActivity))
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionImmunization(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_IMMUNIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_IMMUNIZATION,
						 ConsolPlugin.INSTANCE.getString("ImmunizationsSectionImmunization"),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullImmunizations(ImmunizationsSection) <em>Getnull Immunizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullImmunizations(ImmunizationsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_IMMUNIZATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)";

	/**
	 * The cached OCL query for the '{@link #getnullImmunizations(ImmunizationsSection) <em>Getnull Immunizations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullImmunizations(ImmunizationsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_IMMUNIZATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(consol::ImmunizationActivity)).oclAsType(consol::ImmunizationActivity)
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  EList<ImmunizationActivity> getnullImmunizations(ImmunizationsSection immunizationsSection) {
		if (GETNULL_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION, ConsolPackage.Literals.IMMUNIZATIONS_SECTION.getEAllOperations().get(62));
			try {
				GETNULL_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GETNULL_IMMUNIZATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_IMMUNIZATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ImmunizationActivity> result = (Collection<ImmunizationActivity>) query.evaluate(immunizationsSection);
		return new BasicEList.UnmodifiableEList<ImmunizationActivity>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Immunizations Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.2')
	 * @param immunizationsSection The receiving '<em><b>Immunizations Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImmunizationsSectionEntriesOptionalTemplateId(ImmunizationsSection immunizationsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMMUNIZATIONS_SECTION);
			try {
				VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(immunizationsSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMMUNIZATIONS_SECTION__IMMUNIZATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ImmunizationsSectionEntriesOptionalTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(immunizationsSection, context) }),
						 new Object [] { immunizationsSection }));
			}
			return false;
		}
		return true;
	}

} // ImmunizationsSectionOperations