/**
 */
package org.openhealthtools.mdht.uml.cda.vsdr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Dateand Timeof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.DateandTimeofDeath#validateDateandTimeofDeathText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DateandTimeofDeathOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DateandTimeofDeathOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathTemplateId(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathTemplateId(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathTemplateId(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathTemplateId(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathTemplateId(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathClassCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathClassCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathClassCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathClassCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathClassCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathMoodCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathMoodCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathMoodCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathMoodCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathMoodCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathCodeP(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathCodeP(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathCodeP(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathCodeP(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathCodeP(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '31211-6' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathCode(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathCode(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathEffectiveTime(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_EFFECTIVE_TIME,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathEffectiveTime", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDateandTimeofDeathText(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathText(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDateandTimeofDeathText(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Dateand Timeof Death Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDateandTimeofDeathText(DateandTimeofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param dateandTimeofDeath The receiving '<em><b>Dateand Timeof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateDateandTimeofDeathText(DateandTimeofDeath dateandTimeofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.DATEAND_TIMEOF_DEATH);
			try {
				VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_DATEAND_TIMEOF_DEATH_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(dateandTimeofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.DATEAND_TIMEOF_DEATH__DATEAND_TIMEOF_DEATH_TEXT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DateandTimeofDeathText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(dateandTimeofDeath, context) }),
						 new Object [] { dateandTimeofDeath }));
			}
			 
			return false;
		}
		return true;
	}

} // DateandTimeofDeathOperations