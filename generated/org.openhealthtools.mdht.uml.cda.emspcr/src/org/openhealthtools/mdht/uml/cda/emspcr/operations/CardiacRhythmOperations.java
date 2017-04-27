/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Cardiac Rhythm</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmParticipant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Participant1</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythm#validateCardiacRhythmMethodCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardiacRhythmOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardiacRhythmOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmParticipant1(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Participant1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmParticipant1(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmParticipant1(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Participant1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmParticipant1(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmParticipant1(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_PARTICIPANT1,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmParticipant1"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmTemplateId(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmTemplateId(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.169')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmTemplateId(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmTemplateId(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmTemplateId(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmTemplateId"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmMoodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMoodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmMoodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMoodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmMoodCode(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmMoodCode"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmCodeP(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmCodeP"),
						 new Object [] { cardiacRhythm }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythmCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythmCodeP", passToken);
				}
				passToken.add(cardiacRhythm);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67519-9' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmCode(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.CardiacRhythmCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(cardiacRhythm)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmCode"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmEffectiveTime(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmEffectiveTime(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmEffectiveTime(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmEffectiveTime(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmEffectiveTime(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmEffectiveTime"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmValue(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmValue(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA12904-1' or value.code = 'LA17059-9' or value.code = 'LA17068-0' or value.code = 'LA17070-6' or value.code = 'LA17071-4' or value.code = 'LA17072-2' or value.code = 'LA17073-0' or value.code = 'LA17074-8' or value.code = 'LA17083-9' or value.code = 'LA17084-7' or value.code = 'LA17085-4' or value.code = 'LA17086-2' or value.code = 'LA17087-0' or value.code = 'LA17088-8' or value.code = 'LA17089-6' or value.code = 'LA17090-4' or value.code = 'LA17091-2' or value.code = 'LA17093-8' or value.code = 'LA17094-6' or value.code = 'LA17095-3' or value.code = 'LA17096-1' or value.code = 'LA17097-9' or value.code = 'LA17394-0' or value.code = 'LA17099-5' or value.code = 'LA17100-1' or value.code = 'LA17101-9' or value.code = 'LA17703-2' or value.code = 'LA17704-0' or value.code = 'LA17705-7' or value.code = 'LA17706-5' or value.code = 'LA17708-1' or value.code = 'LA17718-0' or value.code = 'LA18205-7' or value.code = 'LA18206-5' or value.code = 'LA18207-3' or value.code = 'LA18208-1')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmValue(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmValue(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmValue(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_VALUE,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmValue"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmValueP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmValueP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmValueP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmValueP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmValueP(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmValueP"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmMethodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMethodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1 and self.methodCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = element.oclAsType(datatypes::CE) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18682-7' or value.code = 'LA18683-5' or value.code = 'LA18684-3' or value.code = 'LA18685-0')))";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmMethodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMethodCode(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmMethodCode(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_METHOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmMethodCode"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCardiacRhythmMethodCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMethodCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (self.methodCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateCardiacRhythmMethodCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Cardiac Rhythm Method Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCardiacRhythmMethodCodeP(CardiacRhythm, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param cardiacRhythm The receiving '<em><b>Cardiac Rhythm</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCardiacRhythmMethodCodeP(CardiacRhythm cardiacRhythm, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.CARDIAC_RHYTHM);
			try {
				VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CARDIAC_RHYTHM_METHOD_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(cardiacRhythm)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.CARDIAC_RHYTHM__CARDIAC_RHYTHM_METHOD_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("CardiacRhythmCardiacRhythmMethodCodeP"),
						 new Object [] { cardiacRhythm }));
			}
			 
			return false;
		}
		return true;
	}

} // CardiacRhythmOperations
