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

import org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath;
import org.openhealthtools.mdht.uml.cda.vsdr.VsdrPackage;

import org.openhealthtools.mdht.uml.cda.vsdr.util.VsdrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Mannerof Death</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsdr.MannerofDeath#validateMannerofDeathValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MannerofDeathOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MannerofDeathOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathTemplateId(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathTemplateId(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.1.11')";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathTemplateId(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathTemplateId(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathTemplateId(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathClassCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathClassCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathClassCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathClassCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathClassCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathMoodCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathMoodCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathMoodCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathMoodCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathMoodCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathCodeP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathCodeP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathCodeP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathCodeP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathCodeP(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '69449-7' and value.codeSystem = '2.16.840.1.113883.6.1'";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathCode(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathCode(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathValue(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathValue(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and (value.code = '7878000' or value.code = 'CNBD' or value.code = '27935005' or value.code = '38605008' or value.code = 'PI' or value.code = '44301001'))";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathValue(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathValue(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathValue(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMannerofDeathValueP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathValueP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD))";

	/**
	 * The cached OCL invariant for the '{@link #validateMannerofDeathValueP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mannerof Death Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMannerofDeathValueP(MannerofDeath, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param mannerofDeath The receiving '<em><b>Mannerof Death</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMannerofDeathValueP(MannerofDeath mannerofDeath, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsdrPackage.Literals.MANNEROF_DEATH);
			try {
				VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MANNEROF_DEATH_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mannerofDeath)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 VsdrValidator.DIAGNOSTIC_SOURCE,
						 VsdrValidator.MANNEROF_DEATH__MANNEROF_DEATH_VALUE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MannerofDeathValueP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(mannerofDeath, context) }),
						 new Object [] { mannerofDeath }));
			}
			 
			return false;
		}
		return true;
	}

} // MannerofDeathOperations