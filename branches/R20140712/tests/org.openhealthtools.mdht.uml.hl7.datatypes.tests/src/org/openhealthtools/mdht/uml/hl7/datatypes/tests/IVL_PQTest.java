/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.hl7.datatypes.tests;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.ecore.EObject;
import org.junit.Test;
import org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest;
import org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.operations.IVL_PQOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>IVL PQ</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#validateOptionsContainingLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#validateOptionsContainingCenter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Center</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#validateOptionsContainingHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ#validateOptionsContainingWidth(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Options Containing Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */

public class IVL_PQTest extends CDAValidationTest {

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingLow() {
		OperationsTestCase<IVL_PQ> validateOptionsContainingLowTestCase = new OperationsTestCase<IVL_PQ>(
			"validateOptionsContainingLow",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());

						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());

						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_PQOperations.validateOptionsContainingLow((IVL_PQ) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingLowTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	@Test
	public void testValidateOptionsContainingCenter() {
		OperationsTestCase<IVL_PQ> validateOptionsContainingCenterTestCase = new OperationsTestCase<IVL_PQ>(
			"validateOptionsContainingCenter",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_CENTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {

						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_PQOperations.validateOptionsContainingCenter((IVL_PQ) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingCenterTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingHigh() {
		OperationsTestCase<IVL_PQ> validateOptionsContainingHighTestCase = new OperationsTestCase<IVL_PQ>(
			"validateOptionsContainingHigh",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 * 
			 * not self.high.oclIsUndefined() implies
			 * (self.low.oclIsUndefined() and self.center.oclIsUndefined() and self.width.oclIsUndefined()) or
			 * ((not self.low.oclIsUndefined()) and self.width.oclIsUndefined() and self.center.oclIsUndefined()) or
			 * ((not self.width.oclIsUndefined()) and self.low.oclIsUndefined() and self.center.oclIsUndefined())
			 * 
			 * 
			 * Fail States
			 * high and
			 * l c w
			 * X X X
			 * X X -
			 * X - X
			 * - X X
			 * - X -
			 * 
			 * Pass States
			 * high and
			 * l c w
			 * - - -
			 * x - -
			 * - -x
			 */
			@Override
			public void addFailTests() {

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());

						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {
				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());

					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());

					}
				});

			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_PQOperations.validateOptionsContainingHigh((IVL_PQ) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingHighTestCase.doValidationTest();
	}

	/**
	*
	* @generated not
	*/
	@Test
	public void testValidateOptionsContainingWidth() {
		OperationsTestCase<IVL_PQ> validateOptionsContainingWidthTestCase = new OperationsTestCase<IVL_PQ>(
			"validateOptionsContainingWidth",
			operationsForOCL.getOCLValue("VALIDATE_OPTIONS_CONTAINING_WIDTH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP"),
			objectFactory) {
			{
				skipNullTest();
			}

			/*
			 * ((not self.low.oclIsUndefined()) and self.center.oclIsUndefined() and self.high.oclIsUndefined())
			 * or (self.low.oclIsUndefined() and self.center.oclIsUndefined()) or
			 * ((not self.center.oclIsUndefined()) and self.low.oclIsUndefined() and self.high.oclIsUndefined())
			 */
			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addFailTests()
			 */
			@Override
			public void addFailTests() {
				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addFailTest(new FailTest() {

					@Override
					public void updateToFail(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});
			}

			/*
			 * (non-Javadoc)
			 * 
			 * @see org.openhealthtools.mdht.uml.cda.operations.CDAValidationTest.OperationsTestCase#addPassTests()
			 */
			@Override
			public void addPassTests() {

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setLow(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setCenter(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});

				addPassTest(new PassTest() {

					@Override
					public void updateToPass(IVL_PQ target) {
						target.setWidth(DatatypesFactory.eINSTANCE.createPQ());
						target.setHigh(DatatypesFactory.eINSTANCE.createIVXB_PQ());
					}
				});
			}

			@Override
			protected boolean validate(EObject objectToTest, BasicDiagnostic diagnostician, Map<Object, Object> map) {

				return IVL_PQOperations.validateOptionsContainingWidth((IVL_PQ) objectToTest, diagnostician, map);
			}

		};

		validateOptionsContainingWidthTestCase.doValidationTest();
	}

	/**
	*
	* @generated
	*/
	private static class OperationsForOCL extends IVL_PQOperations {
		public String getOCLValue(String fieldName) {

			String oclValue = null;

			try {
				oclValue = (String) this.getClass().getSuperclass().getDeclaredField(fieldName).get(this);
			} catch (Exception e) {
				oclValue = "NO OCL FOUND FOR PROPERTY " + fieldName;
			}
			return oclValue;
		}
	}

	/**
	*
	* @generated
	*/
	private static class ObjectFactory implements TestObjectFactory<IVL_PQ> {

		public IVL_PQ create() {
			return DatatypesFactory.eINSTANCE.createIVL_PQ();
		}
	}

	/**
	*
	* @generated
	*/
	private static OperationsForOCL operationsForOCL = new OperationsForOCL();

	/**
	*
	* @generated
	*/
	private static ObjectFactory objectFactory = new ObjectFactory();

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	private static class ConstructorTestClass extends IVL_PQOperations {
	};

	/**
	* Tests Operations Constructor for 100% coverage
	* @generated
	*/
	@Test
	public void testConstructor() {
		@SuppressWarnings("unused")
		ConstructorTestClass constructorTestClass = new ConstructorTestClass();
	} // testConstructor

	/**
	*
	* @generated
	*/

	@Override
	protected EObject getObjectToTest() {
		return null;
	}

} // IVL_PQOperations
